package f02_output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		String path = "C:"+File.separator+"Temp"+File.separator+"file1.txt";
		/*
		File file = new File(path);
		if(!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("파일 생성 완료");
			} catch (IOException e) {
				System.out.println("생성 실패 : " + e.getMessage());
			}
		}
		*/
		try {
			OutputStream os = new FileOutputStream(path,true);
			String s = "ABC";
			byte[] bytes = s.getBytes();
			os.write(bytes,1,2);
			// os.write(bytes);
			/*
			for(int i=0; i<bytes.length; i++) {
				os.write(bytes[i]);
			}
			*/
			os.flush();
			os.close();
			System.out.println("작성 완료");
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e ) {
			System.out.println("출력 오류");
		}
		
		
		
	}
	
}
