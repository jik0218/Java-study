package section02;

public class EX02_10 {
	public static void main(String[] args) {
		int myAge = 20;
		int yourAge = 30;
		int tempAge;
		
		tempAge = myAge;
		myAge = yourAge;
		yourAge = tempAge;
		
		System.out.println(myAge);
		System.out.println(yourAge);
	}

}
