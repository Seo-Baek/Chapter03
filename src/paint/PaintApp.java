package paint;

//void method() {
//						메쏘드는 클래스 안에 들어있어야 한다!!!!!!!!!!!!!	
//}



public class PaintApp {

	public static void main(String[] args) {
		Point p = new Point();
		p.setX(10);
		p.setY(10);
		drawPoint(p);
		
		Point p2 = new Point(50,100);
		drawPoint(p2);
		
		//메소드 오버로딩 테스트
		p2.show();
		p2.show(true);
		p2.show(false);
	}

	public static void drawPoint(Point point) {
		point.show();
		
	}
	
}
