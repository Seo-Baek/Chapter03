package me.kickscar.paint.shape;

public class Triangle extends Shape {
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private int x3;
	private int y4;
	

	@Override
	public void draw() {
		System.out.println("삼각형을 그렸습니다.");
	}
	public void changeSpotColor(String c) {
		System.out.println("spot x1이 " + c +"로 변경되었습니다.");
	}
	
	
}
