package paint;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		
	}
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	public void show() {
		System.out.println("��[" + x + ", " + y + "]�� ������ϴ�.");
	}
	
	public void show(boolean visable) {
		if(visable) {
			show();		// �ݺ��� ���� ȿ������ �ڵ� 
			
		} else {
			System.out.println("��[" + x + ", " + y + "]�� �������ϴ�.");
			
		}
		
	}
	

	
}
