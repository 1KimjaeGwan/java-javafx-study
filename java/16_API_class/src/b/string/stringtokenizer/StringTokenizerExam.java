package b.string.stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExam {

	public static void main(String[] args) {
		String text = "홍길동/김유신/이순신/최기근";
		
		StringTokenizer st = new StringTokenizer(text,"/");
		int countTokens = st.countTokens();
		System.out.println(countTokens);
		for(int i=0; i<countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println("===================");
		text = "홍길동|페이커,심현석&최기근\\김재관\"이순신";
		st = new StringTokenizer(text,"|,&\\\"");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		
		
		
		
		
		
	}

}
