package me.kickscar.paint.shape;

import me.kickscar.paint.i.Fillable;

public  abstract class Shape implements Fillable{ // �Ϲ�ȭ�� ���� �� ������ ���� �����Ǹ� �ȵǴ� ���̱� ������ ���´�.
	private String fillColor;					  // abstract�� ���ָ� draw�� �����϶�� �����µ� �ڽİ�ü�� ����ϸ� �Ǵϱ� ���´�.
	private String lineColor;
	
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	

}
