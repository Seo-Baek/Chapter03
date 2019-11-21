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
		System.out.println("�ﰢ���� �׷Ƚ��ϴ�.");
	}
	@Override
	public void draw(boolean visable) {
		if(visable) {
			draw();		// �ݺ��� ���� ȿ������ �ڵ� 
			
		} else {
			System.out.println("�ﰢ���� �������ϴ�.");
			
		}
		
	}
	
	
	@Override
	public void allColors(String fillColor, String lineColor) {
		setFillColor(fillColor);
		setLineColor(lineColor);
		System.out.println("�ﰢ���� " + getFillColor() + ", " + getLineColor() + "�� ä�����ϴ�.");
	}
	
	@Override
	public void fillColors(String fillColor) {
		setFillColor(fillColor);
		System.out.println("�ﰢ���� " + getFillColor() + "�� ä�����ϴ�.");
	}
	
	@Override
	public void lineColors(String lineColor) {
		setLineColor(lineColor);
		System.out.println("�ﰢ���� " + getLineColor() + "�� ä�����ϴ�.");
	}
	
	
	
}
