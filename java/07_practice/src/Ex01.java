import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		int[] scores = new int[5];
		// scores.length = 5;
		//  0  1  2  3  4
		// [0][0][0][0][0]
		scores[0] = 10;
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("성적을 입력하세요 > ");
		scores[0] = sc.nextInt(); 
		System.out.println("성적을 입력하세요 > ");
		scores[1] = sc.nextInt();
		*/
		for(int i = 0; i<scores.length; i++) {
			System.out.print("성적을 입력하세요 > ");
			scores[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i : scores) {
			sum+=i;
		}
		System.out.println();
		double avg = (double)sum/scores.length;
		System.out.println("평균성적은 "+avg+"입니다.");
		
	}

}
