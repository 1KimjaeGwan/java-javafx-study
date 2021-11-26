import java.util.Scanner;

public class ForSumExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int sum = 0;
		int ssum = 0;
		System.out.println("숫자를 입력하세요");
		a = sc.nextInt();
		
		for(int i = 0 ; i<=a; i++) {
			sum = sum+i;
			if( i % 3 == 0) {
				ssum = ssum+i;
			}		
		}
		System.out.println("1부터 100까지의 총합계 : "+sum);
		//System.out.printf("1부터 %d까지의 총합계 : %d \n",sum);
		System.out.println("1부터 100 까지의 3의 배수의 총합계 : " + ssum);
		//System.out.printf("1부터 %d까지의 3의 배수의 총합계 : %d",ssum);
	}
}
