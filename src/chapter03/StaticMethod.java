package chapter03;

public class StaticMethod {

	int n;
	static int m;
	
	// �ν��Ͻ� �޼ҵ忡�� �ν��Ͻ� ������ ���� ����!
	int f1() {
		return n;
	}
	
	// �ν��Ͻ� �޼ҵ忡�� Ŭ����(static) ������ ���� ����
	int f2() {
		return m; // StaticMethod. �� �����ϰ� ���� �����ϰ� �����Ϸ��� ������! 
	}
	
	// Ŭ����(static) �޼ҵ忡�� �ν��Ͻ� ������ ���� �Ұ�
	static int s1() {
	   //return n;
		return 0;
	}
	
	// Ŭ����(static) �޼ҵ忡�� Ŭ����(static) ������ ���� ����
	static int s2() {
	   //return StaticMethod.m;
		return m;
	}
	
	// Ŭ����(static) �޼ҵ忡�� Ŭ����(static) �޼ҵ忡 ���� ����
	static int s3() {
		return s2();
	}
	
	// Ŭ����(static) �޼ҵ忡�� �ν��Ͻ� �޼ҵ忡 ���� �Ұ���
	static int s4() {
	   //return f1();
		return 0;
	}
	
	
}//class

