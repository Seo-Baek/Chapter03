package chapter03;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();
		
		// public �� �ܺο��� ������ �����ϴ�.
		p.name = "���";
		
		// protected �� ���� ��Ű��,�ڽ�Ŭ�������� ������ �����ϴ�.
		p.height = 170;
		
		// default �� ���� ��Ű�������� ���� �����ϴ�.
		p.age = 10;
		
		// private �� ���ο����� �����ϴ�.
		//p.weight = 60;
		
	}

}
