
public class Cube extends Shape implements Spatial {
	private double length;
	private double width;
	private double height;
	
	
	public double getLength() {
		return this.length;
	}
	public double getWidth() {
		return this.width;
	}
	public double getHeight() {
		return this.height;
	}
	
	public void setWidth(double width) {
		this.width=width;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public void setLength(double length) {
		this.length=length;
	}
	
	public double volume() {
		return this.height*this.length*this.width;
	}

	public double area() {
		
		return 2 * this.length * this.width + 2 * this.length * this.height + 2* this.width * this.height;
	}

}
