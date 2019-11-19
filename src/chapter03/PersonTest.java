package chapter03;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();
		
		// public 은 외부에서 접근이 가능하다.
		p.name = "사람";
		
		// protected 는 같은 패키지,자식클래스에서 접근이 가능하다.
		p.height = 170;
		
		// default 는 같은 패키지에서는 접근 가능하다.
		p.age = 10;
		
		// private 는 내부에서만 가능하다.
		//p.weight = 60;
		
		Student s = new Student();  // 자식 클래스를 부르면 부모클래스가 먼저 호출된다.
		
	}

}
