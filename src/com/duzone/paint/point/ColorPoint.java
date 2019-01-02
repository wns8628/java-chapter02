package com.duzone.paint.point;

public class ColorPoint extends Point{
	private String color;

	public ColorPoint() {}
	public ColorPoint(int x, int y, String color) {
//		this.setX(x);
//		this.setY(y);
		super(x,y);//이렇게쓰면 훨 이쁨 
		this.color = color;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
    
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("점 [x="+ getX() + 
				", y=" + getY() + 
				", color=" + color +
				"]을 그렸습니다.");	
	}
	
}
