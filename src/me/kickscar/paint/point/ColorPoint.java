package me.kickscar.paint.point;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint() {
		
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);		// �θ�����ڸ� ����߱� ������ ���̻� �������� ����
//		setX(x);
//		setY(y);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void draw() {
		System.out.println("��[" + getX() + ", " + getY() + ", color = " + color + "]�� �׷Ƚ��ϴ�.");
	}
	
	
	
}//class
