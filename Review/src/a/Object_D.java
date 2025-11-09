package a;

// 클래스 Book
class Book{
	//클래스 내부의 데이터(속성, 필드)
	String title; // 제목
	String publisher; // 출판사
	int pageNumber; // 책 페이지 수
	
	// 클래스 내부의 동작(행동, 메서드)
	void dispayInfo() {
		System.out.println(title + " " + publisher + " " + pageNumber);
		return;
		// System.out.println("실행 안됨"); // 해당 코드에 접근할 수 X
	}
	
	// == 생성자 메서드 = //
	// : new 연산자 사용시 호출된 메서드
	// : 
}
public class Object_D {
	

}
