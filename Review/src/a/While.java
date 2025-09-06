package a;

public class While {
	public static void main(String[] args) {
		// === while문 ===
		//: 반복 횟수가 정해져있지 않을 때 사용
		
		//- 조건을 검사하고 해당 조건이 true인 경우 코드 블록을 (반복적) 실행
		//: if 문의 반복 형태
		/*
		   while(조건){
		        조건이 참일 때 실행
		        
		  }
		  
		  >> for 문의 초기화식과 증감식이 조건문과 분리된 형태       
		 */
		
		// 1부터 5가지 1씩 증가하는 정수를 출력
		int num = 1; // 초기화
		
		while(num <= 5) {
			System.out.println(num);
			num++; // 증감식
		}
		// 0부터 20까지의 정수 중에서 홀수만 출력
		// 1) break;
		// : 반복문 내에서 break; 키워드를 만나면 반복문 탈출(종료)
		
		// 2) continue;
		// : 반복문 내에서 continue; 키워드를 만나면 아래의 코드를 무시하고 다시 '조건 검사'
		
		System.out.println();
		int number = 0;
		
		while(true ) { // 무한 루프
			
		   if(number % 2 == 0) {
			   
			   // 짝수
			   number++; // 다음 수 (홀수)를 위한 작업
			   continue;   
		   }
		// 홀수만 해당하는 내용 실행
		   System.out.println(number);
		   number++; // 다음 수 (짝수)를 위한 작업
		   
		   if(number == 20) break;
		}
	}

}
