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
		System.out.println("점[" + x + ", " + y + "]를 찍었습니다.");
	}
	
	public void show(boolean visable) {
		if(visable) {
			show();		// 반복을 줄인 효율적인 코딩 
			
		} else {
			System.out.println("점[" + x + ", " + y + "]를 지웠습니다.");
			
		}
		
	}
	

	
}
