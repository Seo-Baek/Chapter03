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
		System.out.println("�簢���� �׷Ƚ��ϴ�.");
	}
	@Override
	public void draw(boolean visable) {
		if(visable) {
			draw();		// �ݺ��� ���� ȿ������ �ڵ� 
			
		} else {
			System.out.println("�簢���� �������ϴ�.");
			
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
