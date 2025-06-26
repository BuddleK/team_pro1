package teamTask;

import java.util.Random;
import java.util.Scanner;

public class Game {
	int answer; // 정답
	int level; // 난이도
	int tryCount; // 시도 횟수
	int limit; // 입력제한수
	int input;
	int rn1;
	int rn2;
	int range;
//	4팀 하   랜덤숫자 맞추기
//	   1~100사이의 랜덤숫자를 정하고 사용자가 맞출 때까지 계속 입력하게하기
//	   메소드 : 난이도선택(1~5), 게임실행, 정답비교, 힌트제공, 게임종료
//	   조건 : 최대시도횟수제한(10)

	// setLevel() 최장현 : 난이도 선택

	void setLevel(Scanner sc) {
		while (true) {
			System.out.print("난이도를 입력하세요 (1부터 5까지!): ");
			this.level = sc.nextInt();
			int level = this.level;
			if (level <= 5 && level > 0) {
				range = level * 20;

				break;
			} else {
				System.out.println("레벨은 5레벨까지만 있습니다. 다시 입력해주세요");
			}
		}
	}

	void setRandom() {
		Random r = new Random();
		this.answer = r.nextInt(range) + 1;
		System.out.println("선택한 난이도는 " + level + "입니다.");
		System.out.println("범위는 1부터 " + range + "까지 입니다.");
		this.limit = level * 5;
		System.out.println("최대 시도 횟수는 " + limit + "입니다.");
	}

	// checkAnswer() 강승훈 : 정답비교
	boolean checkAnswer() {
		if (this.input == this.answer) {
			System.out.println("정답입니다!!");
			return true;
		} else {
			System.out.println("틀렸습니다!!");
			return false;
		}
	}

	// getHint() 이재빈 : 힌트제공

	void getHint() {
		if (this.input > this.answer) {
			System.out.println("!!힌트!! : 정답보다 큰수를 입력했습니다!!");
		} else {
			System.out.println("!!힌트!! : 정답보다 작은수를 입력했습니다!!");
		}

		if (this.tryCount == this.limit / 2) {
			this.rn1 = (int) (Math.random() * 10);
			this.rn2 = (int) (Math.random() * 10);
		} else if (this.tryCount == this.limit - 1) {
			this.rn1 = (int) (Math.random() * 3);
			this.rn2 = (int) (Math.random() * 3);
		}

		// 힌트 범위가 정답 범위를 벗어나면 (범위와 정답의 차이만큼만)으로 조정하기
		if ((this.answer - this.rn1) < 0) {
			this.rn1 = this.answer - 1;
		}
		if ((this.answer + this.rn2) > this.level * 20) {
			this.rn2 = this.level * 20 - this.answer;
		}

		System.out.printf("정답은 %d에서 %d사이에 있습니다.\n", this.answer - this.rn1, this.answer + this.rn2);

		System.out.printf("%d번 시도했습니다. %d번 남았습니다.\n", this.tryCount, this.limit - this.tryCount);

	}

	// getStart() 백정이 : 게임실행

	void getStart(Scanner sc) {

		while (true) {
			System.out.print("숫자를 맞춰주세요!!! 입력 : ");
			input = sc.nextInt();
			System.out.println(input + "을 입력하셨습니다.");

			tryCount++;
			if (input < 1 || input > (this.level * 20)) {
				System.out.println("!!!!!!!!범위를 벗어난 입력입니다.!!!!!!!!!");
			} else {
				System.out.println(tryCount + "번 입력을 했습니다!");
				if (checkAnswer()) {
					break;
				}
				if (this.limit / 2 == tryCount) {
					getHint();
				} else if (this.tryCount == this.limit - 1) {
					getHint();
				}
			}

			if (tryCount == this.limit) {
				System.out.println("시도횟수를 초과했습니다!");
				break;
			}

		}

		quit();

	}

	// quit()강버들 : 종료

	void quit() {

		System.out.println("종료합니다!!!");

	}

}