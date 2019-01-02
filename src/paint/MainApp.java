package paint;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Point p1 = new Point();
		p1.setX(100);
		p1.setY(200);
//		p1.show();
		drawPrint(p1);
	
		Point p2 = new Point(50,50);
//		p2.show();
//		p2.show(false);		
		drawPrint(p2);
		
		
//		ColorPoint p3 = new ColorPoint();
		Point p3 = new ColorPoint();
		((ColorPoint)p3).setColor("red"); //이렇게해줘야 Point가 지꺼만참조하는걸 막을수있다? 
		p3.setX(100);
		p3.setY(50);
//		p3.show();
//		p3.show(false);
		drawPrint(p3);
		
		Point p4 = new ColorPoint(200,100,"yello");
		drawPrint(p4);
		
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
		Shape circle = new Circle();
//		drawCircle(circle);
		draw(circle);
	}

//	함수만드는이유. 마우스이벤트발생시 이걸부르면되잔아
	public static void drawPrint(Point point) {
		point.show();
	}
	
//	public static void DrawTriangle(Triangle triangle) {
//		triangle.draw();
//	}
//	public static void drawRect(Rect rect) {
//		rect.draw();
//	}
//	public static void drawCircle(Circle circle) {
//		circle.draw();
//	}
	
	public static void draw(Shape shape) { //이렇게하면 함수많이안만들어도됨
		shape.draw();
	}
	
}
