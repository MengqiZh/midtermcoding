package pkg_Shapes;

import pkg_HelperShapes.Shape;


public class Rectangle extends Shape implements Comparable<Rectangle> {
	
	private int iWidth;
	
	private int iLength;
	
	public Rectangle(int iLength, int iWidth) {
		this.iWidth = iWidth;
		this.iLength = iLength;
	}
	
	public int getiWidth() {
		return iWidth;
	}
	
	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}
	
	public int getiLength() {
		return iLength;
	}
	
	public void setiLength(int iLength) {
		this.iLength = iLength;
	}
	
	@Override
	public int compareTo(Rectangle rect) {
		if (this.area() > rect.area()) {
			return 1;
		} else if (this.area() < rect.area()) {
			return -1;
		} else {
			return 0;
		}
	}
	
	@Override
	public double area() {
		return (double) iLength * iWidth;
	}
	
	@Override
	public double perimeter() {
		return (double) 2 * iLength + 2 * iWidth;
	}
	
	
	
}
