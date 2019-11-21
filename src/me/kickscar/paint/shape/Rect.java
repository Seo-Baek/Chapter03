package me.kickscar.paint.shape;

public class Rect extends Shape {
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private int x3;
	private int y3;
	private int x4;
	private int y4;
	
	
	@Override
	public void draw() {
		System.out.println("사각형을 그렸습니다.");
	}
	@Override
	public void draw(boolean visable) {
		if(visable) {
			draw();		// 반복을 줄인 효율적인 코딩 
			
		} else {
			System.out.println("사각형을 지웠습니다.");
			
		}
		
	}
	@Override
	public void allColors(String fillColor, String lineColor) {
		System.out.println("원에 " + fillColor + ", " + lineColor + "를 채웠습니다.");
	}
	
	@Override
	public void fillColors(String fillColor) {
		System.out.println("원에 " + fillColor + "를 채웠습니다.");
	}
	
	@Override
	public void lineColors(String lineColor) {
		System.out.println("원에 " + lineColor + "를 채웠습니다.");
	}
	
}
