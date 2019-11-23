package exception;

import java.io.IOException;

public class DangerClass {
	public void Danger() throws IOException,MyException {
		System.out.println("some code 1");
		System.out.println("some code 2");
		
		if(1 == 1) {
			throw new MyException();
		}
		throw new IOException();
		
	}
}
