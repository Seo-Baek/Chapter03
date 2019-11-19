package chapter03;

public class Student extends Person {
	public Student() {
		//자식 생성자에서 부모 생성자를 명시적으로 호출하지 않으면
		//컴파일러가 부모의 기본 생성자를 << 맨 앞 >>에 넣어준다.
		//super();
		System.out.println("Strudent() 호출");
	}
}
