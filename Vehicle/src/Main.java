import java.util.Scanner;
public class Main extends Vehicle {
	public Main(String vehicleNumber, String modelName, String vehicleType, double price) 
	{
		super(vehicleNumber, modelName, vehicleType, price);
	}

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter vehicle number:");
		String v_num=s.nextLine();
		System.out.println("Enter vehicle model Name:");
		String v_model=s.nextLine();
		System.out.println("Enter vehicle type:");
		String v_type=s.nextLine();
		System.out.println("Enter vehicle price:");
		double price=s.nextInt();
		Vehicle v=new Vehicle(v_num,v_model,v_type,price);
		System.out.println("Eligble loan amount:"+v.issueLoan());
		System.out.println("The vehicle's insurance price:"+v.takeInsurance());

		
	}

}
