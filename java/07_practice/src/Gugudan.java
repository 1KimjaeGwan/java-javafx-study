import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		for(int i=2; i<10; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j+" * "+i+" = "+(i*j)+"\t");
				//System.out.printf("%d * %d = %2d\t",j,i,(i*j));
			}
			System.out.println();
		}
	}

}
