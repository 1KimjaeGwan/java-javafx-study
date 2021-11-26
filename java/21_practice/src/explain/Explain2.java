package explain;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * 2. 해당 국가의 수도 맞추기 게임을 프로그램으로 만들고자 한다.
 *  나라 이름(country)과 수도(capital)로 구성된 
 *  Nation 클래스를 작성하고 ArrayList<Nation> 컬렉션을 이용하여
 *  프로그램을 작성시오.
 *  (ArrayList에 8개의 국가에 대한 기본적인 정보 입력)
 *
 */
class Nation{
	
	private String country;
	private String capital;
	
	public Nation(String country, String capital) {
		this.country = country;
		this.capital = capital;
	}

	public String getCountry() {
		return country;
	}

	public String getCapital() {
		return capital;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Nation){
			Nation n = (Nation)obj;
			if(n.getCountry().equals(this.country)) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
}

public class Explain2 {
	
	private ArrayList<Nation> store = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	
	public Explain2() {
		store.add(new Nation("한국","서울"));
		store.add(new Nation("프랑스","파리"));
		store.add(new Nation("그리스","아테네"));
		store.add(new Nation("중국","베이징"));
		store.add(new Nation("스페인","마드리드"));
		store.add(new Nation("영국","런던"));
		store.add(new Nation("독일","베를린"));
		store.add(new Nation("러시아","모스크바"));
	}
	
	public void run() {
		System.out.println("*** 수도 맞추기 게임을 시작합니다 ***");
		while(true) {
			System.out.print("입력:1, 퀴즈:2, 종료:3 >>");
			int menu = sc.nextInt();
			switch(menu) {
			case 1 :
				// 국가별 수도 정보를 추가 입력
				input();
				break;
			case 2 :
				// 국가이름으로 수도 정보 맞추기 게임 시작
				quiz();
				break;
			case 3 :
				System.out.println("게임을 종료합니다.");
				return;
			default : 
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
	
	public void input() {
		// 국가별 수도 정보 입력하기
		// - 중복된 국가는 추가 입력 안되게 설정
		int n = store.size();
		System.out.println("현재 "+n+"개의 나라와 수도가 입력되어 있습니다.");
		while(true) {
			System.out.printf("국가 입력(현재:%d번째 국가 등록 / q는 종료)",store.size()+1);
			String country = sc.next();
			if(country.equals("q")) {
				System.out.println("입력을 종료합니다.");
				break;
			}
			System.out.println("수도 입력>>");
			String capital = sc.next();
			// 입력받은 국가이름과 수도이름으로 List에 저장함
			// Nation 객체 생성
			Nation nation = new Nation(country,capital);
			// 국가 이름으로 동일한 국가이름의 Nation객체가 존재하는지 확인
			// contains 함수는 동일한 객체가 존재하는지 확인할때
			// equals method를 이용하여 확인
			// Nation에 재정의된 equals를 통해 국가이름이 동일하면
			// 동일한 객체로 확인하도록 표현
			if(store.contains(nation)) {
				System.out.println(country+"는 이미 존재합니다.");
				continue;
			}
			/*
			for(int i=0; i<store.size(); i++) {
				Nation na = store.get(i);
				if(na.getCountry().equals(nation.getCountry())) {
					System.out.println(country+"는 이미 존재합니다.");
					continue a;
				}
			}
			*/
			// 중복된 국가가 아니라면 List에 추가
			store.add(nation);
		}
	}
	
	public void quiz() {
		// 문제를 낼 나라를 선택
		// random 함수를 통해
		// 리스트안에 등록된 국가 정보를 실행 시 랜덤하게 호출
		
		// List가 비어있다면 모든 문제를 확인한 것
		if(store.isEmpty()) {
			System.out.println("모두 확인했습니다!!");
			return;
		}
		
		int index = (int)(Math.random()*store.size());
		Nation nation = store.get(index);
		String question = nation.getCountry();
		String answer = nation.getCapital();
		System.out.print(question+"의 수도는? ");
		
		// 사용자에게 수도이름을 입력받음
		String capitalFromUser = sc.next();
		if(answer.equals(capitalFromUser)) {
			System.out.println("정답");
			// 맞힌 정보는 삭제
			store.remove(index);
		}else {
			// 잘못된 수도정보는 정답을 알려줌
			System.out.printf("아닙니다!! %s의 수도는 %s 입니다 %n",question,answer);
		}
	}
	
	

	public static void main(String[] args) {
		// 생성자를 통해 국가별 수도 정보를 등록하고
		// run()를 호출하여 프로그램 시작
		new Explain2().run();
	}
}




