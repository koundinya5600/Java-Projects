import java.util.*;
//import java.lang.Math.*;
public class Main {
	public static void main(String [] args) {
	Scanner s=new Scanner(System.in);
	Shape s_ar[]=new Shape[5];
	for(int i=0;i<5;i++) {
		String  s_type=s.nextLine();
		if(s_type.equalsIgnoreCase("Triangle")) {
			Triangle t1=new Triangle();
			double base=Double.parseDouble(s.nextLine());
			double height=Double.parseDouble(s.nextLine());
			t1.setBase(base);
			t1.setHeight(height);
			s_ar[i]=t1;
		}
		else if(s_type.equalsIgnoreCase("Rectangle")) {
			Rectangle r1=new Rectangle();
			double length=Double.parseDouble(s.nextLine());
			double width=Double.parseDouble(s.nextLine());
			r1.setLength(length);
			r1.setWidth(width);
			s_ar[i]=r1;
		} 
		else if(s_type.equalsIgnoreCase("Cube")) {
			Cube c1=new Cube();
			double length=Double.parseDouble(s.nextLine());
			double width=Double.parseDouble(s.nextLine());
			double height=Double.parseDouble(s.nextLine());
			c1.setHeight(height);
			c1.setWidth(width);
			c1.setLength(length);
			s_ar[i]=c1;
		} 
		else if(s_type.equalsIgnoreCase("Sphere")) {
			Sphere s1=new Sphere();
			double radius=Double.parseDouble(s.nextLine());
			s1.setRadius(radius);
			s_ar[i]=s1;
		} 
	}
		
		for(int j=0;j<5;j++) {
			System.out.println("Area"+s_ar[j].area());
			if(s_ar[j] instanceof Spatial) {
				System.out.println("Volume"+s_ar[j].volume());
			}
	
	}
}
}


