package com.duzone.paint.main;

import com.duzone.paint.i.Drawable;
import com.duzone.paint.point.ColorPoint;
import com.duzone.paint.point.Point;
import com.duzone.paint.shape.Circle;
import com.duzone.paint.shape.Rect;
import com.duzone.paint.shape.Shape;
import com.duzone.paint.shape.Triangle;
//import com.duzone.paint.shape.*;
import com.duzone.paint.text.GraphicString;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Point p1 = new Point();
		p1.setX(100);
		p1.setY(200);
//		p1.show();
		draw(p1);
	
		Point p2 = new Point(50,50);
//		p2.show();
//		p2.show(false);		
		draw(p2);
		
		
//		ColorPoint p3 = new ColorPoint();
		Point p3 = new ColorPoint();
		((ColorPoint)p3).setColor("red"); //이렇게해줘야 Point가 지꺼만참조하는걸 막을수있다? 
		p3.setX(100);
		p3.setY(50);
//		p3.show();
//		p3.show(false);
		draw(p3);
		
		Point p4 = new ColorPoint(200,100,"yello");
		draw(p4);
		
//		Triangle triangle = new Triangle();
		Shape triangle = new Triangle();
//		DrawTriangle(triangle);
		triangle.setLineColor("black");
		
	//down casting -> 명시적(exlicity)
//		Triangle t1 = (Triangle)triangle;
//		t1.setX1(10); 한번쓰고 t1은 안쓰니 밑에처럼하는게낫지 
		((Triangle)triangle).setX1(10);
//		triangle.setX1(10);
		draw(triangle);
		
		
	//up Casting -> 암시적
		Rect rect = new Rect();
		Shape r1 = rect;
//		drawRect(rect);
		draw(r1);
		
//		Circle circle = new Circle();
//		Shape circle = new Circle();
		Drawable circle = new Circle(); //인터페이스면 이렇게해줄수있다.
//		drawCircle(circle);
		draw(circle);
		
		
		GraphicString gs = new GraphicString("Hello");
		draw(gs); //이게 객체지향이다 이새기야 쩔지 
		
		//연산자 instanceof 텍
		Shape s = new Circle();
		System.out.println( s instanceof Shape);
		System.out.println( s instanceof Circle);
		System.out.println( s instanceof Rect);
		System.out.println( s instanceof Drawable);
		System.out.println( s instanceof Runnable);

		Circle c = (Circle)s;
		System.out.println(c instanceof Circle);
		System.out.println(c instanceof Shape);
//		System.out.println(c instanceof Rect); 계층관계아니면 에러남
		
	}

	
//	함수만드는이유. 마우스이벤트발생시 이걸부르면되잔아
	
	//오우 메소드하나로 다됨! 손안됨개꿀
	public static void draw(Drawable drawable) {
		drawable.draw();
	}
	
	
//	public static void drawPrint(Point point) {
//		point.show();
//	}
	
//	public static void DrawTriangle(Triangle triangle) {
//		triangle.draw();
//	}
//	public static void drawRect(Rect rect) {
//		rect.draw();
//	}
//	public static void drawCircle(Circle circle) {
//		circle.draw();
//	}
	
//	public static void draw(Shape shape) { //이렇게하면 함수많이안만들어도됨
//		shape.draw();
//	}

}
