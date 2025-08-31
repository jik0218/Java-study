package chapter02;

public class Z_Ansser {
	public static void main(String[] args) {
		    //  *****
			//	****
			//	***
			//	**
			//	*
		// 줄의 순서 : 1, 2, 3, 4, 5
		// 별의 개수 : 5, 4, 3, 2, 1
		// : 정답 작성
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5 -i; j++) {
//				System.out.print("*");
//			}
//			
//			for(int k =0; k < i; k++) {
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
		
		int height = 5; //별의 높이를 고정값 5로 설정
		
		// 첫 번째 for 문 : 줄(row)을 제어 - 5줄 출력
		for(int i = height; i >= 1; i--) {
			
			// 두 번째 for문 : 각 줄에 별을 출력
			for(int j = 1; j <= i; j++) {
				System.out.print("*"); // 별 출력
			}
			System.out.println(); // 줄 바꿈
		}
		
		System.out.println("---------------------------------------------");
		
		//  *****
		//	 ****
		//	  ***
		//	   **
		//	    *
		
		// : 정답 작성
		int num = 5;
		
		// 첫 번째 for 문 : 줄(row)을 제어 - 5줄 출력
		for(int i = num; i >=1; i--) {
			// i는 5, 4, 3, 2, 1
			
			// 두 번째 for 문 : 줄의 시작 부분에 공백을 추가 (오른쪽 정렬)
			// - 0, 1, 2, 3, 4
			for(int j = 1; j <= num -i; j++) {
				System.out.print(" ");
			}
			
			// 세 번째 for 문 : 별을 추가
			// - 5, 4, 3, 2, 1
			for(int k =1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println(); // 줄 바꿈
		}
		
	}
	

}
