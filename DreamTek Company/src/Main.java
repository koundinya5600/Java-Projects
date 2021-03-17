import java.util.Scanner;

public class Main extends Associate{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		Associate a1=new Associate();
		System.out.println("Enter the associate id:");
		int id=s1.nextInt();
		s1.nextLine();
		System.out.println("Enter the associate name:");
		String name=s1.nextLine();
		
		System.out.println("Enter the number of days:");
		int num=s1.nextInt();
		a1.setAssociateId(id);
		a1.setAssociateName(name);
		a1.trackAssociateStatus(num);
	


	}

}
