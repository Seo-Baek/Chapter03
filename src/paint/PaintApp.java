package paint;

//void method() {
//						�޽��� Ŭ���� �ȿ� ����־�� �Ѵ�!!!!!!!!!!!!!	
//}



public class PaintApp {

	public static void main(String[] args) {
		Point p = new Point();
		p.setX(10);
		p.setY(10);
		drawPoint(p);
		
		Point p2 = new Point(50,100);
		drawPoint(p2);
		//�޼ҵ� �����ε� �׽�Ʈ
		p2.show();
		p2.show(true);
		p2.show(false);
		
		//�޼ҵ� �������̵� �׽�Ʈ
		//ColorPoint p3 = new ColorPoint();
		Point p3 = new ColorPoint();
		p3.setX(200);
		p3.setY(300);
		//p3.setColor("red");
		//drawColorPoint(p3);�� �� �� ������ �θ� �����ϴ� ���� ����.
		((ColorPoint)p3).setColor("red"); //�ٿ�ĳ���ý� �� ( (�ٿ�Ŭ������) ����) �̷��� ���������!
		drawPoint(p3);
		
		p3.show(true);
		p3.show(false);
		
	
	}

	public static void drawPoint(Point point) {
		point.show();
		
	}

//	public static void drawColorPoint(ColorPoint colorpoint) {
//		colorpoint.show();
//		
//	}
	
}
