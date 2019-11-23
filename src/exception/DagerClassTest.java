package exception;

import java.io.IOException;

public class DagerClassTest {

	public static void main(String[] args) {
		DangerClass dc = new DangerClass();
		try {
			dc.danger();
		} catch(IOException e) {
			e.printStackTrace();
		} catch(MyException e) {
			e.printStackTrace();
			
		}
	}

}
