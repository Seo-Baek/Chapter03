package me.kickscar.paint.text;

import me.kickscar.paint.i.Drawable;

public class GraphicText implements Drawable {
	private String text;
	
	public GraphicText(String text) {
		this.text = text;
	}
	
	
	@Override
	public void draw() {
		System.out.println("그래픽 텍스트 '" + text + "'를 그렸습니다.");

	}
	public void draw(boolean visable) {
		if(visable) {
			draw();		// 반복을 줄인 효율적인 코딩 
			
		} else {
			System.out.println("그래픽 텍스트 '" + text + "'를 지웠습니다.");
			
		}
		
	}
	
	

}
