
public class Rectangle extends Shape implements Spatial {
	private double length;
	private double width;
	
	public double getLength() {
		return this.length;
	}
	public double getWidth() {
		return this.width;
	}
	public void setWidth(double width) {
		this.width=width;
	}
	public void setLength(double length) {
		this.length=length;
	}
	
	public double volume() {
		
		return -1;
	}
	
	public double area() {
		
		return length*width;
	}
	
	
}
	

