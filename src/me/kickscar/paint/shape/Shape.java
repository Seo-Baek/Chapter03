package me.kickscar.paint.shape;

import me.kickscar.paint.i.Fillable;

public  abstract class Shape implements Fillable{ // 일반화를 위한 곳 개성이 없어 구현되면 안되는 곳이기 때문에 막는다.
	private String fillColor;					  // abstract를 없애면 draw를 구현하라고 나오는데 자식개체가 사용하면 되니까 막는다.
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
