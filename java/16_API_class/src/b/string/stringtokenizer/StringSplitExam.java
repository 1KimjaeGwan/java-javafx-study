package b.string.stringtokenizer;

public class StringSplitExam {

	public static void main(String[] args) {
		String text = "홍길동&이수홍,박수홍,김연아,김자바-페이커";
		String[] names = text.split("&|,|-");
		for(String s : names) {
			System.out.print(s+" ");
		}
	}

}
