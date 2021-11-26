import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int floor = 0;
		System.out.println("층수를 입력하세요.");
		floor = sc.nextInt();
		
		switch(floor) {
		case 1 : {
			System.out.println("1층은 정형외과입니다");
			break;
		}
		case 2 : {
			System.out.println("2층은 약국입니다.");
			break;
		}
		case 3 : {
			System.out.println("3층은 헬스클럽입니다.");
			break;
		}
		default : {
			System.out.println("없는 층입니다.");
		}
		
		
		}//switch 종료
	}

}
