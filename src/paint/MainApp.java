package paint;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Point p1 = new Point();
		p1.setX(100);
		p1.setY(200);
		p1.show();
	
		Point p2 = new Point(50,50);
		p2.show();
		p2.show(false);		
		
//		ColorPoint p3 = new ColorPoint();
		Point p3 = new ColorPoint();
		((ColorPoint)p3).setColor("red"); //이렇게해줘야 Point가 지꺼만참조하는걸 막을수있다? 
		
		p3.setX(100);
		p3.setY(50);
		p3.show();
		p3.show(false);
	}

//	함수만드는이유. 마우스이벤트발생시 이걸부르면되잔아
	public static void drawPrint(Point point) {
		point.show();
	}
	
}
