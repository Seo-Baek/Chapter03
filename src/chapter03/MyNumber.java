package chapter03;

public class MyNumber {
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public static int abs(int number) {
		if(number < 0) {
			number *= (-1);
		}
		return number;
	}
	
	public int abs() {
		if(value < 0) {
			value *= (-1);
		}
		return value;
	}

	public static int max(int i, int j) {
//		int result = 0;
//		if(i > j) {
//			result = i;
//		} else {
//			result = j;
//		}
		int result = (i > j) ? i :j; //���� ���� �ڵ�� �ƴ� ������ �߰��� �� eual �� ��
		return result;
	}

}
