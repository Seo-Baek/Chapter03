package chapter03_2;

import chapter03.Person;

public class Student extends Person {
	public void test() {
		// public은 외부에서 접근이 가능하다.(아무데서나)
		name = "학생";
		
		// protected는 자식에서 접근이 가능하다.
		height = 190;
		
		// default는 자식에서 접근 안 됨.
		//age = 20;
		
	}
	
}
