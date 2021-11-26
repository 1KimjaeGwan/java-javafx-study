package test1029;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("문자열을 입력해 주세요>>");
			String s = sc.nextLine();
			if(s.indexOf("java") != -1) {
				System.out.println("java가 존재 합니다.");
				System.out.println("시스템을 종료합니다.");
				break;
			}
			System.out.println("java가 존재 하지 않습니다.");
		}
		sc.close();
	}

}
