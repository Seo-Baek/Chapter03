package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		int a = 0;
		System.out.println("Some Codd 1");
		System.out.println("Some Codd 2");
		System.out.println("Some Codd 3");
		
		try {
			int result = 1000/a;
		} catch(ArithmeticException ex) {
			//1.���
			System.out.println("�˼��մϴ�. ����ġ ���� ��Ȳ�� �߻��Ͽ����ϴ�.");
			
			//2.�α׳����
			System.out.println(ex);
			
			//3.��������
			return;
			
			//1,2,3 ���� ���� ���ϸ�
			//���� �ڵ�� ������� ���� catch ���� ��� ���� ���ƾ� �Ѵ�!
			//ex.printStackTrace();
		}
		System.out.println("Some Codd 4");
		System.out.println("Some Codd 5");
		System.out.println("Some Codd 6");
	}

}
