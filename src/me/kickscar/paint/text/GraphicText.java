package me.kickscar.paint.text;

import me.kickscar.paint.i.Drawable;

public class GraphicText implements Drawable {
	private String text;
	
	public GraphicText(String text) {
		this.text = text;
	}
	
	
	@Override
	public void draw() {
		System.out.println("�׷��� �ؽ�Ʈ '" + text + "'�� �׷Ƚ��ϴ�.");

	}
	public void draw(boolean visable) {
		if(visable) {
			draw();		// �ݺ��� ���� ȿ������ �ڵ� 
			
		} else {
			System.out.println("�׷��� �ؽ�Ʈ '" + text + "'�� �������ϴ�.");
			
		}
		
	}
	
	

}
