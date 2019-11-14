package chapter03_2;

import chapter03.Person;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();  //ctrl + shift + o;
		
		//public 은 외부에서 접근이 가능하다.
		p.name = "사람2";
		
		//protected 는 같은 패키지, 자식클래스에서 접근 가능하다.
		//p.height = 180;
		
		// default 는 같은 패키지에서는 접근 가능하다.
		//p.age = 10;

		
		
	}

}
