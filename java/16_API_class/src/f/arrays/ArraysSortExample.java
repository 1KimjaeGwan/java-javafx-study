package f.arrays;

import java.util.Arrays;

public class ArraysSortExample {

	public static void main(String[] args) {
		int[] scores = {96,99,98,97,100};
		String values = Arrays.toString(scores);
		System.out.println(values);
		
		// Arrays.sort(배열, 시작인덱스, 마지막인덱스 -1);
		Arrays.sort(scores, 2 , 4);
		System.out.println(Arrays.toString(scores));
		
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		
		String[] names = {"홍길동","박찬호","강민호","전지현"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		// Arrays.fill 값을 대체
		Arrays.fill(names, 1,3,"심현석");
		System.out.println(Arrays.toString(names));
		
		Arrays.fill(names, "심현석");
		System.out.println(Arrays.toString(names));
	}

}
