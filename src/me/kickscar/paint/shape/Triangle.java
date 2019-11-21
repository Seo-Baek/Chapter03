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
	@Override
	public void draw(boolean visable) {
		if(visable) {
			draw();		// 반복을 줄인 효율적인 코딩 
			
		} else {
			System.out.println("삼각형을 지웠습니다.");
			
		}
		
	}
	
	
	@Override
	public void allColors(String fillColor, String lineColor) {
		setFillColor(fillColor);
		setLineColor(lineColor);
		System.out.println("삼각형에 " + getFillColor() + ", " + getLineColor() + "를 채웠습니다.");
	}
	
	@Override
	public void fillColors(String fillColor) {
		setFillColor(fillColor);
		System.out.println("삼각형에 " + getFillColor() + "를 채웠습니다.");
	}
	
	@Override
	public void lineColors(String lineColor) {
		setLineColor(lineColor);
		System.out.println("삼각형에 " + getLineColor() + "를 채웠습니다.");
	}
	
	
	
}
