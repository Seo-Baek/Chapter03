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
//						�޽��� Ŭ���� �ȿ� ����־�� �Ѵ�!!!!!!!!!!!!!	
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
		
		// 1. �޼ҵ� �����ε� �׽�Ʈ
		p2.show();
		p2.show(true);
		p2.show(false);
		
		// 2. �޼ҵ� �������̵� �׽�Ʈ
		//ColorPoint p3 = new ColorPoint();
		Point p3 = new ColorPoint();
		p3.setX(200);
		p3.setY(300);
		//p3.setColor("red");
		//drawColorPoint(p3);�� �� �� ������ �θ� �����ϴ� ���� ����.
		((ColorPoint)p3).setColor("red"); //�ٿ�ĳ���ý� �� ( (�ٿ�Ŭ������) ����) �̷��� ���������! �ȵǸ� undefined���� ����
		//drawPoint(p3);
		draw(p3); 
		
		p3.show(true);
		p3.show(false);
		
		// 3. ��Ӱ��迡���� ������ ȣ�� �׽�Ʈ
		Point p4 = new ColorPoint(500, 10000, "Yellow");
		draw(p4);
		
		// 4. Shape Test
		draw(new Triangle());
		draw(new Rect());
		draw(new Circle());
		draw(new GraphicText("Hello World"));
		
		Rect r1 = new Rect();
		r1.allColors("Green", "Yellow");
		
		//Shape s = new Shape();  <<�߻�Ŭ�����̱� ������ ȣ���� ���� �ʴ´�!
		
		//5. instanceOf ������ �׽�Ʈ
		// ��Ӱ���� �ִ� �𷡽��鸸 �����ϴ�(Ʋ�� �θ�ų� �ڽ�!)
		Shape s = new Rect();
		System.out.println(s instanceof Object);
		System.out.println(s instanceof Shape);
		System.out.println(s instanceof Rect);
		System.out.println(s instanceof Triangle);
		
		Rect r = new Rect();
		System.out.println(r instanceof Object);
		System.out.println(r instanceof Shape);
		System.out.println(r instanceof Rect);
	  //System.out.println(r instanceof Triangle);     <�� ������ �ȵȴ٤Ф�
		
		//�������̽��� ��� (��������) �� �θ��ڽ� ������� ������ �����ϴ�.
		System.out.println(r instanceof Drawable);
	  //System.out.println(r instanceof String);
		System.out.println(r instanceof List); //List�� �ڷ���
		
		
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
