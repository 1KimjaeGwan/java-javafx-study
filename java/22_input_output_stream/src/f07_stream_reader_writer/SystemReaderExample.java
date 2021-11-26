package f07_stream_reader_writer;

import java.io.*;

public class SystemReaderExample {

	public static void main(String[] args) throws Exception{
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		int readData = 0;
		char[] cbuf = new char[100];
		while((readData = reader.read(cbuf)) != -1) {
			// 캐릭터 배열로 문자열 생성 하되
			// 캐릭터 배열에 0번째 인덱스 부터 ,
			// readData길이만큼만 문자열로 생성
			String data = new String(cbuf, 0, readData);
			if(data.startsWith("quit"))break;
			System.out.println(data);
		}
		
		reader.close();
		is.close();
		System.out.println("종료");
		
	}

}
