import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		int size = 10;
		int[] seats = new int[size];
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("------------------");
			for(int i = 0; i< seats.length;i++)
				System.out.print((i+1)+" ");
			System.out.println("\n------------------");
			for(int i = 0; i< seats.length;i++)
				System.out.print(seats[i]+" ");
			System.out.println("\n------------------");
			System.out.println("원하시는 좌석번호를 입력하세요(종료는 -1)");
			int seatNum = sc.nextInt();
			System.out.println("선택하신 좌석 번호 : " + seatNum);
			if(seatNum == -1) {
				System.out.println("시스템이 종료되었습니다.");
				break;
			}else if(seatNum < 1 || seatNum > 10) {
				System.out.println("선택할 수 없는 자리입니다.");
				continue;
			}else if(seats[seatNum-1] == 0) {
				seats[seatNum-1] = 1;
				System.out.println("예약이 완료되었습니다.");
			}else {
				System.out.println("이미 예약이 완료된 자리입니다.");
			}
			
		}//while 종료
	}

}
