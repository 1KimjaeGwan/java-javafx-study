import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
byte[][] seats = new byte[10][10];
		
		/*
		for(byte[] b : seats) {
			for(byte b1 : b) {
				if(b1 == 0) {
					System.out.print("[□]");
				}else {
					System.out.print("[■]");
				}
			}
			System.out.println();
		}
		*/
		Scanner sc = new Scanner(System.in);
		char inputColumn = 0;
		boolean isRun = true;
		while(isRun) {
			System.out.println("           [screen]");
			for(int i=0; i<seats.length; i++) {
				System.out.print("["+(i+1)+"]");
			}
			System.out.println(" [행]");
			
			for(int i=0; i<seats.length; i++) {
				for(int j=0; j<seats[i].length; j++) {
					if(seats[i][j] == 0) {
						System.out.print("[□]");
					}else {
						System.out.print("[■]");
					}
				} // j for문 종료
				System.out.println("["+(char)(i+65)+"열]");
			} //  ifor문 종료
			
			System.out.println("예약하실 좌석의 열을 입력해주세요.");
			String s = sc.next();
			inputColumn = s.charAt(0);
			System.out.println("선택하신 열의 이름 : "+inputColumn);
			
			System.out.println("예약하실 좌석의  행번호를 입력해 주세요.");
			int rowNum = sc.nextInt();
			System.out.println("선택하신 행번호는  : "+rowNum+"입니다.");
			
			seats[inputColumn-65][rowNum-1] = 1;
			
		} // while 종료
	}

}
