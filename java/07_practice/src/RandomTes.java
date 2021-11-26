
public class RandomTes {


	
	public static void main(String[] args) {			
		int sum = 0;
		for(int i=0; i<10; i++) {
			int iNumber = (int)(Math.random()*99)+1;
			System.out.print(iNumber+" ");
			sum = sum+iNumber;
		}
		System.out.println("난수 총합계 : "+sum);
		
	}
}
