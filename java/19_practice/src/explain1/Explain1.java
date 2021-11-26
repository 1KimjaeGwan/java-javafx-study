package explain1;

import java.util.Arrays;

class T{}

public class Explain1 {
	
	public static void printArray(T[] t) {
		System.out.println(Arrays.toString(t));
	}
	
	public static <T> void printArray(T[] t) {
		System.out.println(Arrays.toString(t));
	}
	
	public static void main(String[] args) {
		Integer[] iArray = { 10, 20, 30, 40, 50 };
		
		Double[] dArray = { 1.1, 1.2, 1.3, 1.4, 1.5 };
		
		Character[] cArray = { 'K', 'O', 'R', 'E', 'A' };
		
		printArray(iArray);
		Explain1.<Double>printArray(dArray);
		Explain1.<Character>printArray(cArray);
		printArray(new T[] {new T()});
	}

	

}
