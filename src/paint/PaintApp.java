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
	}

	public static void drawPoint(Point point) {
		point.show();
		
	}
	
}
