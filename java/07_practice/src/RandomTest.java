import java.util.Arrays;

public class RandomTest {

	public static void main(String[] args) {
		int[] random = new int[10];
		for(int i=0; i<random.length; i++) {
			random[i] = (int)(Math.random()*99)+1;
		}
		
		System.out.print("최초의 리스트 : ");
		for(int i : random) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.print("정렬된 리스트 : ");
		Arrays.sort(random);
		for(int i : random) {
			System.out.print(i+" ");
		}
		
		
		
		
	}	
}
