package me.kickscar.paint.main;

import java.util.List;

import me.kickscar.paint.i.Drawable;
import me.kickscar.paint.i.Fillable;
import me.kickscar.paint.point.ColorPoint;
import me.kickscar.paint.point.Point;
import me.kickscar.paint.shape.Circle;
import me.kickscar.paint.shape.Rect;
import me.kickscar.paint.shape.Shape;
import me.kickscar.paint.shape.Triangle;
import me.kickscar.paint.text.GraphicText;

//void method() {
//						메쏘드는 클래스 안에 들어있어야 한다!!!!!!!!!!!!!	
//}



public class PaintApp {

	public static void main(String[] args) {
		Point p = new Point();
		p.setX(10);
		p.setY(10);
		//drawPoint(p);
		draw(p);
		
		Point p2 = new Point(50,100);
		//drawPoint(p2);
		draw(p2);
		
		// 1. 메소드 오버로딩 테스트
		p2.show();
		p2.show(true);
		p2.show(false);
		
		// 2. 메소드 오버라이딩 테스트
		//ColorPoint p3 = new ColorPoint();
		Point p3 = new ColorPoint();
		p3.setX(200);
		p3.setY(300);
		//p3.setColor("red");
		//drawColorPoint(p3);로 할 수 있으나 부모를 참조하는 것이 좋다.
		((ColorPoint)p3).setColor("red"); //다운캐스팅시 꼭 ( (다운클래스명) 변수) 이렇게 묶어줘야함! 안되면 undefined으로 나옴
		//drawPoint(p3);
		draw(p3); 
		
		p3.show(true);
		p3.show(false);
		
		// 3. 상속관계에서의 생성자 호출 테스트
		Point p4 = new ColorPoint(500, 10000, "Yellow");
		draw(p4);
		
		// 4. Shape Test
		draw(new Triangle());
		draw(new Rect());
		draw(new Circle());
		draw(new GraphicText("Hello World"));
		
		Rect r1 = new Rect();
		r1.allColors("Green", "Yellow");
		
		//Shape s = new Shape();  <<추상클래스이기 때문에 호출이 되지 않는다!
		
		//5. instanceOf 연산자 테스트
		// 상속관계로 있는 쿨래스들만 가능하다(틀의 부모거나 자식!)
		Shape s = new Rect();
		System.out.println(s instanceof Object);
		System.out.println(s instanceof Shape);
		System.out.println(s instanceof Rect);
		System.out.println(s instanceof Triangle);
		
		Rect r = new Rect();
		System.out.println(r instanceof Object);
		System.out.println(r instanceof Shape);
		System.out.println(r instanceof Rect);
	  //System.out.println(r instanceof Triangle);     <ㅡ 형제는 안된다ㅠㅠ
		
		//인터페이스의 경우 (구현관계) 는 부모자식 상관없이 연산이 가능하다.
		System.out.println(r instanceof Drawable);
	  //System.out.println(r instanceof String);
		System.out.println(r instanceof List); //List는 자료형
		
		
	}
	
	public static void draw(Drawable drawable) {
		drawable.draw();
	}
	


//	public static void drawPoint(Point point) {
//		point.show();
//		
//	}
//	
//	public static void drawShape (Shape shape) {
//		shape.draw();
//	}
//	public static void drawTriangle (Triangle triangle) {
//		triangle.draw();
//	}
//
//	public static void drawRectangle (Rect rect) {
//		rect.draw();
//	}
	

}
