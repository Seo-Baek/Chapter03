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
		
		//메소드 오버라이딩 테스트
		//ColorPoint p3 = new ColorPoint();
		Point p3 = new ColorPoint();
		p3.setX(200);
		p3.setY(300);
		//p3.setColor("red");
		//drawColorPoint(p3);로 할 수 있으나 부모를 참조하는 것이 좋다.
		((ColorPoint)p3).setColor("red"); //다운캐스팅시 꼭 ( (다운클래스명) 변수) 이렇게 묶어줘야함!
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
