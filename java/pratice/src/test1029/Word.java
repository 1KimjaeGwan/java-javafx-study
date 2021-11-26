package test1029;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Word {

	public static void main(String[] args) {
		String chars = "abcdefghijklmnopqrstuvwxyz";
		String num = "1234567890";
		
		System.out.print("문자나 숫자를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		// 코드 작성
		String temp = str.toLowerCase();
		
		boolean isCheck = (chars.indexOf(temp) != -1);
		System.out.println("입력받은 문자 : " + str);
		System.out.printf("영어문자  : %b %n", isCheck);
		isCheck = num.contains(temp);
		System.out.printf("숫자 : %b", isCheck);
		
		sc.close();
	}
}
