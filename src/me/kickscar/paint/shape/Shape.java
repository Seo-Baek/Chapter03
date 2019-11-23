package me.kickscar.paint.shape;

import me.kickscar.paint.i.Drawable;


public  abstract class Shape implements Drawable{ // 일반화를 위한 곳 개성이 없어 구현되면 안되는 곳이기 때문에 막는다.
	private String fillColor;					  // abstract를 없애면 draw를 구현하라고 나오는데 자식개체가 사용하면 되니까 막는다.
	private String lineColor;
	

	
	

}
