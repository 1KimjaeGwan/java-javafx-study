package test;

import java.util.Scanner;

public class ForSumExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int sum = 0;
		int b = 0;
		int c = 0;
				
		
		System.out.println("숫자를 입력하세요 >");
		a = sc.nextInt();
		
		for(int i=0; i<=a; i++) {
			sum = sum + i ;
			if(i % 2 == 0) {
				b = b+i;
			}else if(i % 2 == 1){
				c = c+i;
			}
		}
		System.out.println("1부터 100까지의 총합계 : "+sum);
		System.out.println("1부터 100까지의 짝수의 총합계 : "+b);
		System.out.println("1부터 100까지의 홀수의 총합계 : "+c);
		
	}

}
