package teamTask;

import java.util.Random;
import java.util.Scanner;

public class Game {
	int answer; // 정답
	int level; // 난이도
	int tryCount; // 시도 횟수
	int limit; // 입력제한수
	int input;
	boolean setHintRange = true;
	int rn1;
	int rn2;

//	4팀 하   랜덤숫자 맞추기
//	   1~100사이의 랜덤숫자를 정하고 사용자가 맞출 때까지 계속 입력하게하기
//	   메소드 : 난이도선택(1~5), 게임실행, 정답비교, 힌트제공, 게임종료
//	   조건 : 최대시도횟수제한(10)

	// setLevel() 최장현 : 난이도 선택

	// checkAnswer() 강승훈 : 정답비교




	// getHint() 이재빈 : 힌트제공
	void getHint() {
		if (this.input > this.answer) {
			System.out.println("!!힌트!! : 정답보다 큰수를 입력했습니다!!");
		} else {
			System.out.println("!!힌트!! : 정답보다 작은수를 입력했습니다!!");
		}

//		      if (this.setHintRange) {
//		         this.rn1 = (int) (Math.random() * 10); // 3 5
//		         this.rn2 = (int) (Math.random() * 10); // 3 5
//		         this.setHintRange = false;
//		      }

		if (this.tryCount == this.limit / 2) {
			this.rn1 = (int) (Math.random() * 10); // 3 5
			this.rn2 = (int) (Math.random() * 10); // 3 5
		} else if (this.tryCount == this.limit - 2) {
			this.rn1 = (int) (Math.random() * 3); // 3 5
			this.rn2 = (int) (Math.random() * 3); // 3 5
		}

		// 힌트 범위가 정답 범위를 벗어나면 (범위와 정답의 차이만큼만)으로 조정하기
		if ((this.answer - this.rn1) < 0) {
			this.rn1 = this.answer - 1;
		}
		if ((this.answer + this.rn2) > this.level * 20) {
			this.rn2 = this.level * 20 - this.answer;
		}

//		      if (this.tryCount == this.limit - 1) {
//		         this.setHintRange = true;
//		      }

		System.out.printf("정답은 %d에서 %d사이에 있습니다.\n", this.answer - this.rn1, this.answer + this.rn2);

		System.out.printf("%d번 시도했습니다. %d번 남았습니다.\n", this.tryCount + 1, this.limit - this.tryCount - 1);

	}

	// getStart() 백정이 : 게임실행



	// quit()강버들 : 종료

}