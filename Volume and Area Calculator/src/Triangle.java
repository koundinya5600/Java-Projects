
public class Triangle extends Shape implements Spatial {
	private double base;
	private double height;
	
	public double getHeight() {
		return this.height;
	}
	public double getBase() {
		return this.base;
	}
	public void setBase(double base) {
		this.base=base;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	
	public double volume() {
		
		return -1;
	}
	
	public double area() {
		
		return 1*this.base*this.height/2;
	}
}
