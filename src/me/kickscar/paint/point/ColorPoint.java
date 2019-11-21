package me.kickscar.paint.point;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint() {
		
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);		// 부모생성자를 명시했기 때문에 더이상 생성되지 않음
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
		System.out.println("점[" + getX() + ", " + getY() + ", color = " + color + "]를 그렸습니다.");
	}
	
	
	
}//class
