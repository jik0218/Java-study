package section02;

import java.io.Closeable;
import java.util.Scanner;

public class ScannerSplit {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name, adderss;
		int age;
		double weight;
		
		System.out.println("이름, 주소, 나이, 체중을 빈칸으로 구분하여 순서대로 입력하세요.");
		name = sc.next();
		adderss = sc.next();
		age = sc.nextInt();
		weight = sc.nextDouble();
		
		System.out.printf("당신의 이름은 %s입니다.%n",name);
		System.out.printf("당신의 주소는 %s입니다.%n",adderss);
		System.out.printf("당신의 나이는 %d입니다.%n",age);
		System.out.printf("당신의 이름은 %.1fKg입니다.%n",weight);
		
		sc.close();		
		
		
	}

}
