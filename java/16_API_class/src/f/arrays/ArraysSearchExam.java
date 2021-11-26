package f.arrays;

import java.util.Arrays;

public class ArraysSearchExam {

	public static void main(String[] args) {
		int scores[] = {1, 10, 5, 8, 7};
					//  0   1  2  3  4 
					// -1  -2 -3 -4 -5 -6
		int index = Arrays.binarySearch(scores, 10);
		System.out.println("index : " + index);
		
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		index = Arrays.binarySearch(scores, 10);
		System.out.println("찾은 index : " + index);
		
		for(int i=0; i<=10; i++) {
			index = Arrays.binarySearch(scores, i);
			System.out.println(i+" 찾은 인덱스 : "+ index);
		}
		
		String[] names = {"심현석","김재관","양은정"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		index = Arrays.binarySearch(names, "김재관");
		System.out.println("찾은 인덱스 : "+index);
		
	}
}
