import java.util.InputMismatchException;
import java.util.Scanner;
public class ArrayException 
{
	
	public String getPriceDetails()
	{
		try {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int n=s1.nextInt();
		int ar[] = new int[n];
		
		System.out.println("Enter the price details");
		for(int i=0;i<n;i++)
		{
			ar[i]=s1.nextInt();
			
		}
		System.out.println("Enter the index of the array element you want to access");
		int index=s1.nextInt();
		
		
		return "The array element is " +ar[index];
		}catch(ArrayIndexOutOfBoundsException i) {
			return "Array index is out of range";
		}
		catch(InputMismatchException i) {
			return "Input was not in the correct format";


		}
		
		


		
		
	}

	public static void main(String[] args) 
	{
		//Scanner s=new Scanner(System.in);
		
		ArrayException a=new ArrayException();
		System.out.println(a.getPriceDetails());
		
	}

}
