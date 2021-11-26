package b.string.string_builder;

public class StringBuilerExam {
	
	public static void main(String[] args) {
		String a = "최기근";
		System.out.println(a.hashCode());
		a += "천재";
		System.out.println(a.hashCode());
		a += "다";
		System.out.println(a.hashCode());
		
		StringBuilder sb = new StringBuilder("초기값 : ");
		sb.append("자바 ");
		sb.append("Programming Study");
		System.out.println(sb.toString());
		System.out.println(sb.hashCode());
		// 문자열 4번째 인덱스에 2라는 문자열 추가
		sb.insert(4, "2");
		System.out.println(sb.toString());
		System.out.println(sb.hashCode());
		
		// 해당인덱스 위치의 문자를 변경
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		System.out.println(sb.hashCode());
		
		// delete(시작 인덱스, 해당 자리까지) 문자열을 삭제
		sb.delete(4, 6);
		System.out.println(sb.toString());
		System.out.println(sb.hashCode());
		
		
		
	}
}
