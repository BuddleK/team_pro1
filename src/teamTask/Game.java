package teamTask;

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

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// checkAnswer() 강승훈 : 정답비교


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// getHint() 이재빈 : 힌트제공


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//getStart() 백정이 : 게임실행

	void getStart(Scanner sc) {

	      while(true) {
	         System.out.print("숫자를 맞춰주세요!!! 입력 : ");
	         input = sc.nextInt();
	         System.out.println(input + "을 입력하셨습니다.");
	         if(input < 1 || input > (this.level * 20)) {
	            System.out.println("!!!!!!!!범위를 벗어난 입력입니다.!!!!!!!!!");
	         }else {
	            System.out.println(tryCount + "번 입력을 했습니다!");
	            if(checkAnswer()) {
	               break;
	            }
	            if(this.limit / 2 == tryCount) {
	               getHint();
	            }
	         }
	         tryCount++;
	         
	         if(tryCount == this.limit) {
	            System.out.println("시도횟수를 초과했습니다!");
	            break;
	         }

	      }
	      
	      
	      
	      quit();
	      
	   }
	

	
	// quit()강버들 : 종료


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
