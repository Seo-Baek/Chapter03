package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("hello.txt"); //파일이 없는 경우에는 무조건 트라이캐치를 강제하는 메소드
			int data = fis.read();
			System.out.println((char)data);
		} catch (FileNotFoundException e) {
			System.out.println("에러: " + e);
			return;
		} catch (IOException e) {
			System.out.println("에러: " + e);
			return;
		} finally {				//앞에서 return 되더라도 실행된다
			System.out.println("자원 정리");
			try {
				if(fis != null) {	//null일 가능성을 잡아준다
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}//main

}//class
