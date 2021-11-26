package explain;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *  1. Scanner 클래스를 사용하여 6개 학점('A', 'B', 'C', 'D', 'F')을 
 *  문자로 입력받아 ArrayList에 저장(Character) 하고, 
 *  ArrayList를 검색하여 학점을 
 *  점수(A=4.0, B=3.0, C=2.0, D=1.0, F=0)로 
 *  변환하여 평균을 출력하는 프로그램을 작성하시오.
 *  - 평균은 반올림하여 소수점 2번째 자리까지 표현
 *  - split 또는 StringTokenizer를 이용하여 각 문자를 잘라냄.   
 *  - nextLine() 메소드를 이용하여 공백을 기준으로 알파벳을 입력받음.
 */
public class Explain1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 문자를 저장할 List 선언
		ArrayList<Character> list = new ArrayList<>();
		System.out.println("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >>");
		// 한줄을 입력받아 value에 저장
		String value = sc.nextLine();
		System.out.println("입력완료");
		// 공백을 기준으로 문자열을 잘라서 배열로 저장
		String[] strs = value.split(" ");
		System.out.println(Arrays.toString(strs));
		
		for(int i=0; i< strs.length; i++) {
			// 배열에 저장된 문자열의 첫번째 문자를 가져와 List에 저장
			char c = strs[i].charAt(0);
			list.add(c);
			// list.add(strs[i].charAt(0))
		}
		System.out.println(list);
		
		double sum = 0;
		//for(char s : list) {
		for(int i = 0; i < list.size(); i++) {
			// List에 저장된 문자를 읽어와 문자별 점수를 sum에 누적 저장
			char c = list.get(i);
			switch(c) {
				case 'A' :
					sum = sum + 4.0;
					break;
				case 'B' :
					sum += 3.0;
					break;
				case 'C' :
					sum += 2.0;
					break;
				case 'D' :
					sum += 1.0;
					break;
				case 'F' :
					sum += 0;
					break;
			}
		}
		
		System.out.println(list);
		double avr = sum / list.size();
		// 소수점 두째짜리까지 평균을 표현
		DecimalFormat df = new DecimalFormat("##.##");
		String result = df.format(avr);
		System.out.println("평균은 : " + result);
		System.out.printf("평균은 : %.2f%n" , avr);
		avr = (Math.rint(sum/list.size()*100))/100;
		System.out.println("평균은 : " + avr);
 		
		
		
		
		
		
		
		
		
		
		
		System.out.println("시스템 종료");
		sc.close();	
	}
}




