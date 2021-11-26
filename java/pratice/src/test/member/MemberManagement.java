package test.member;

import java.util.Scanner;

public class MemberManagement{

	// 사용자 입력
	private Scanner sc = new Scanner(System.in);
	
	// 회원정보 저장
	private Member[] members = new Member[100];
	
	// 관리자 계정
	private Member master = new Member(100,"master","root","root");
	
	// 로그인한 회원
	private Member loginMember = null;
	
	// 프로그램 flag (true : 진행 , false : 종료) 
	private boolean isRun = true;
	
	// 메뉴 번호 선택
	private int selectNo;

	// 프로그램 실행용 생성자
	public MemberManagement() {
		members[members.length-1] = master;
		isRun();
	}
	
	/*
	 * 기능 관리 
	 */
	
	// 프로그램 실행
	private void isRun() {
		while(true) {
			System.out.println("===========================================================");
			System.out.println("1.회원가입 |2.로그인 |3.회원목록|4.회원정보수정|5.회원탈퇴|6.프로그램종료");
			System.out.println("===========================================================");
			selectNo = sc.nextInt();
			
			switch(selectNo) {
			case 1 :
				System.out.println("== 회원가입 == ");
				join();
				break;
			case 2 :
				System.out.println("== 로그인 == ");
				login();
				break;
			case 3 :
				System.out.println("== 회원 목록 == ");
				select();
				break;
			case 4 :
				System.out.println("== 회원정보수정 == ");
				update();
				break;
			case 5 : 
				System.out.println("== 회원탈퇴 == ");
				delete();
				break;
			case 6 :
				System.out.println("프로그램 종료");
				terminate();
				break;
			default :
				System.out.println("선택 할 수 없는 번호 입니다.");
			}
		}
		
	}
	
	// 프로그램 종료
	private void terminate() {
		this.isRun = false;
	}

	// 회원 가입
	private void join() {
		System.out.println("사용정보를 입력해주세요 ----------");
		System.out.println("아이디를 입력해주세요 >");
		String id = sc.next();
		System.out.println("비밀번호를 입력 해주세요 >");
		String pw = sc.next();
		System.out.println("비밀번호를 확인해주세요 >");
		String repw = sc.next();
		if(!memberIdCheck(id) || !pw.equals(repw)) {
			System.out.println("사용 할 수 없는아이디 이거나 비밀번호가 일치하지 않습니다.");
			return;
		}
		System.out.println("이름을 입력해주세요 >");
		String name = sc.next();
		for(int i=0; i<members.length; i++) {
			if(members[i] == null) {
				members[i] = new Member((i+1),name,id,pw);
				System.out.println("회원가입 완료");
				return;
			}
		}
		
	}
	
	// 로그인
	private void login() {
		System.out.println("아이디를 입력해주세요 >");
		String id = sc.next();
		System.out.println("비밀번호를 입력해주세요 >");
		String pw = sc.next();
		Member member = findMember(new Member (id,pw));
		if(member != null) {
			System.out.println("정삭적으로 로그인 되었습니다.");
			loginMember = member;
			System.out.println(loginMember.toString());
			if(loginMember == master) {
				System.out.println("관리자 계정입니다.");
			}
			return;
		}
		System.out.println("일치하는 회원정보가 없습니다.");
		
	}

	// 회원목록 - 로그인한 회원이 관리자 일때만 노출 
	private void select() {
		if(loginMember != master) {
			System.out.println("관리자만 확인가능한 메뉴 입니다.");
			return;
		}
		for(Member m : members) {
			if(m != null) {
				System.out.println(m.toString());
			}
		}
	}
	
	// 회원정보 수정 - 로그인한 회원 정보랑 일치 하거나 관리자 일때만 수정(이름정보만 수정)
	private void update() {
		if(loginMember == null) {
			System.out.println("로그인 후 사용 할 수 있는 메뉴입니다.");
			return;
		}
		
		if(loginMember == master) {
			System.out.println("== 관리자 회원정보 수정");
			System.out.println(master.toString());
			System.out.println("수정할 회원 번호를 입력해주세요.");
			int Num = sc.nextInt();
			for(int i=0; i<members.length; i++) {
				if(members[i] != null && members[i].getmNum() == Num) {
					System.out.println("수정할 회원의 이름을 입력해주세요 >");
					String name = sc.next();
					members[i].setmName(name);
					System.out.println("수정완료");
					return;
				}
			}
			System.out.println("일치하는 회원을 찾을 수 없습니다.");
		}else {
			System.out.println("내정보 수정 -----");
			System.out.println("비밀번호를 한번더 입력해주세요 >");
			String pw = sc.next();
			if(loginMember.getmPw().equals(pw)) {
				System.err.println("밀번호가 일치하지 않습니다.");
				return;
			}
			System.out.println("수정할 이름을 입력해주세요 >");
			String name = sc.next();
			loginMember.setmName(name);
			System.out.println("내정보 수정완료");
			System.out.println(loginMember.toString());
		}
		
	}
	
	// 회원탈퇴 - 삭제 할려는 정보가 본인 정보일때만 삭제
	private void delete() {
		System.out.println("회원탈퇴 >");
		if(loginMember == master) {
			System.out.println("master 계정은 삭제할 수 없습니다.");
			return;
		}
		
		System.out.println("정말로 탈퇴 하시겠습니까? y/n");
		char str = sc.next().charAt(0);
		switch(str) {
		case 'Y' : case 'y' : case 'ㅛ' :
			System.out.println("회원탈퇴 완료");
			deleteMember();
			break;
		default :
			System.out.println("회원탈퇴가 취소되었습니다.");
		}
	}
	
	// 사용자 아이디 중복 체크
	private boolean memberIdCheck(String mId) {
		for(Member m : members) {
			if(m != null && m.getmId().equals(mId)) {
				return false;
			}
		}		
		return true;
	}
	
	// 회원 아이디와 비밀번호로 회원 찾기
	private Member findMember(Member m) {
		for(Member member : members) {
			if(member != null && member.equals(m)) {
				return member;
			}
		}
		return null;
	}
	
	// 회원 정보 삭제
	private void deleteMember() {
		for(int i=0; i<members.length; i++) {
			if(members[i].equals(loginMember)) {
				members[i] = null;
				loginMember = null;
				System.out.println("회원탈퇴 완료");
				return;
			}
		}
	}
}
