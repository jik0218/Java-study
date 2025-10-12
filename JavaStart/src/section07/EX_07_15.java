package section07;

public class EX_07_15 {
	public static void main(String[] args) {
		Student2 stu1 = new Student2();
		stu1.studentName = "김고이";
		stu1.hello();
		System.out.println("학교는 " + Student2.schoolName + "입니다.");
		Student2.goToSchool();
		
		System.out.println();
		
		Student2 stu2 = new Student2();
		stu2.studentName = "김고삼";
		stu2.hello();
		System.out.println("학교는 " + stu2.schoolName + "입니다.");
		Student2.goToSchool();
	}

}
