package teamTask;

import java.util.Random;
import java.util.Scanner;

public class Game {
	int answer;		//정답
	int level;		// 난이도
	int tryCount;	// 시도 횟수
	int limit;		// 입력제한수
	int input;		
	
	
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
	        	int range = level * 20;
	        	Random r = new Random();
	        	this.answer = r.nextInt(range)+1;
	        	System.out.println("선택한 난이도는 " + level + "입니다.");
	            System.out.println("범위는 1부터 " + range + "까지 입니다.");
	            this.limit = level * 5;
	            System.out.println("최대 시도 횟수는 " + limit + "입니다.");
	            break;
	         } else {
	            System.out.println("레벨은 5레벨까지만 있습니다. 다시 입력해주세요");

	         }
	      }
	   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// checkAnswer() 강승훈 : 정답비교


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// getHint() 이재빈 : 힌트제공


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//getStart() 백정이 : 게임실행


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// quit()강버들 : 종료


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
