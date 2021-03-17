import java.util.Scanner;
public class Test {
	public static float calculateAverage(int[] age) {
		
		float avg=0;
		int sum=0;
		for(int i=0;i<age.length;i++) {
			if(age[i]>=28 && age[i]<=40) {
				sum+=age[i];
				avg=(float)sum/age.length;
			}
			else {
				System.out.println("Invalid age encountered!");
				System.exit(0);
			}
		}
		return avg;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int num=0;
		System.out.println("Enter total no.of employees:");
		num=s.nextInt();
		if(num>0) {
			if(num>=2) {
				System.out.println("Enter the age for "+num+" employees:");
				int ar[]=new int[num];
				for(int i=0;i<ar.length;i++) {
					ar[i]=s.nextInt();
					//if(ar[i]<0 || ar[i]>)
					//System.out.println(i);
					
				}
				//s.nextLine();
				System.out.print("The average age is ");
				System.out.printf("%.2f", Test.calculateAverage(ar));
			}
			else {
				System.out.println("Please enter a valid employee count");
			}
			
			
		}
		else {
			System.out.println("Please enter a valid employee count");
			System.exit(0);
		}

	}

}
