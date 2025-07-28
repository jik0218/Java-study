package section02;

public class EX02_25 {
	public static void main(String[] args) {
		int num1 = 14;
		double num2 = 3.14;
		
		// 자동 변환을 할 수 없는 역방향! 컴파일 에러 발생! 
//		double num4 = num1;
//		int num3 = (double)num2;
		
		int num4 = (int)num2;
		System.out.println(num4);
	}

}
