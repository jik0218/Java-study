package section08;

public class Person2 {
	private int age;
	
	void setAge(int num) {
		if(num <= 0) {
			System.out.println("잘못된 수를 입력하였습니다. 1이상의 값으로 설정하세요.");
			return;
		}else {
			age = num;
		}
	}
	
	int getAge() {
		return age;
	}

}
