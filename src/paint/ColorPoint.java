package paint;

public class ColorPoint extends Point {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void show() {
		System.out.println("��[" + getX() + ", " + getY() + ", color = " + color + "]�� �׷Ƚ��ϴ�.");
	}
	
	
	
}//class
