
public class Vehicle implements Loan,Insurance {
	
	private String vehicleNumber;
	private String modelName;
	private String vehicleType;
	private double price;
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Vehicle(String vehicleNumber, String modelName, String vehicleType,double price) {
		
		this.vehicleNumber = vehicleNumber;
		this.modelName = modelName;
		this.vehicleType=vehicleType;
		this.price = price;
	}
	public double issueLoan() 
	{
	    System.out.println("Issueloan");
		double l_amt=0d;
		if(this.vehicleType.equals("4 wheeler"))
		{
		    l_amt=0.8*this.price;
	    }
		else if(this.vehicleType.equals("3 wheeler"))
		{
			l_amt=0.75*this.price;
	    }
		else if(this.vehicleType.equals("2 wheeler"))
		{
			l_amt=0.5*this.price;
	    }
		return l_amt;
	}
	public double takeInsurance() 
	{
		double amt=0d;
		if(this.price<=150000)
		{
			amt=3500;
		}
		else if(this.price>150000 && this.price<=300000)
		{
		    amt=4000;		
		}
		else if(this.price>300000)
		{
			amt=5000;		}
		return amt;
	}
	

}
