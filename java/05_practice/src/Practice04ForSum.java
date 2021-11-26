
public class Practice04ForSum {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i < 11; i++) {
			//System.out.println(i+" ");
			System.out.printf("%-2d",i);
			// sum += i;
			sum = sum + i;
		}
		System.out.println();
		System.out.print("합 : " + sum);
		System.out.println("\n합 : " + sum);

	}

}
