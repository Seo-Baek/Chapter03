package me.kickscar.paint.shape;

public class Circle extends Shape {
	private int x;
	private int y;
	private int radius;
	
	@Override
	public void draw() {
		System.out.println("���� �׷Ƚ��ϴ�.");
	}
	
	@Override
	public void draw(boolean visable) {
		if(visable) {
			draw();		// �ݺ��� ���� ȿ������ �ڵ� 
			
		} else {
			System.out.println("���� �������ϴ�.");
			
		}
		
	}
	@Override
	public void allColors(String fillColor, String lineColor) {
		System.out.println("���� " + fillColor + ", " + lineColor + "�� ä�����ϴ�.");
	}
	@Override
	public void fillColors(String fillColor) {
		System.out.println("���� " + fillColor + "�� ä�����ϴ�.");
	}
	@Override
	public void lineColors(String lineColor) {
		System.out.println("���� " + lineColor + "�� ä�����ϴ�.");
	}
}
