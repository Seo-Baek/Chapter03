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
	public void changeSpotColor(String c) {
		System.out.println("spot x1�� " + c +"�� ����Ǿ����ϴ�.");
	}
	
	
}
