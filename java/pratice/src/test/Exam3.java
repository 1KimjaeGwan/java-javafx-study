package test;

public class Exam3 {

	public static void main(String[] args) {
		int[] score = { 10, 20, 50, 70, 5, 6, 80, 90 };
		
		int max;
		int mim;
		
		max = mim = score[0];
		
		for(int i : score) {
			max = (i < max) ? max : i;
			mim = (i > mim) ? mim : i;
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("최대값은 : "+max);
		System.out.println("최소값은 : "+mim);
	}
}
