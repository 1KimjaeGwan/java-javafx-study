package test;

public class Gugudan {

	public static void main(String[] args) {
		for(int i=9; i>1; i--) {
			for(int j=9; j>1; j--) {
				System.out.printf("%d * %d = %d\t",i,j,(i*j));
				//System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}

}
