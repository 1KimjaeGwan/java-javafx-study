package explain;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *  4. Scanner 클래스로 ‘-1’이 입력될 때까지 
 *  양의 정수를 입력받아 TreeSet에 저장하고 
 *  정보를 검색하여 가장 큰 수를 출력하는 프로그램을 작성하시오.
 */
public class Explain4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> set = new TreeSet<>();
		System.out.println("정수(-1이 될때까지 입력)");
		while(true) {
			int n = sc.nextInt();
			if(n == -1)break;
			set.add(n);
		}
		int min = set.first();
		int max = set.last();
		System.out.println(set);
		System.out.println("최소값 : " +  min);
		System.out.println("최대값 : " +  max);
		System.out.println("시스템 종료");
		sc.close();
	}
}









