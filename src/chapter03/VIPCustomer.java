package chapter03;

public class VIPCustomer extends Customer {

	public void set() {
		//public�� ���ٰ��� (��𼭵��� ���� ����)
		job = "student";
		
		//protected�� ���ٰ��� (���� ��Ű��, �ڽĿ��� ���� ����)
		address = "����� ���� ���Ĺߵ�";
		
		// default�� ���� ���� (���� ��Ű���̱� ������ �����ϴ�)
		age = 19;
		
		
		//private�� �ڽĿ��� �����Ҽ� ����.
		//name = "�Ѹ�";
		
	}

}
