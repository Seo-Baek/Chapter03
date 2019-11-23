package me.kickscar.paint.shape;

public class Circle extends Shape {
	private int x;
	private int y;
	private int radius;
	
	@Override
	public void draw() {
		System.out.println("원을 그렸습니다.");
	}
	
	
//	@Override
//	public void draw(String c) {
//		System.out.println("");
//	}   자식이 부모의 메소드를 override할 때 overload로 할 수 없다.

	

}
