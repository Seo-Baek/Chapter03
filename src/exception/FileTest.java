package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("hello.txt"); //������ ���� ��쿡�� ������ Ʈ����ĳġ�� �����ϴ� �޼ҵ�
			int data = fis.read();
			System.out.println((char)data);
		} catch (FileNotFoundException e) {
			System.out.println("����: " + e);
			return;
		} catch (IOException e) {
			System.out.println("����: " + e);
			return;
		} finally {				//�տ��� return �Ǵ��� ����ȴ�
			System.out.println("�ڿ� ����");
			try {
				if(fis != null) {	//null�� ���ɼ��� ����ش�
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}//main

}//class
