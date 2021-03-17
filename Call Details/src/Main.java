import java.util.Scanner;
public class Main extends Call{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Call c1=new Call();
		System.out.println("Enter details");
		String s = sc.nextLine();
		c1.parseData(s);
		System.out.println("id:"+c1.getCallId());
		System.out.println("number:"+c1.getCalledNumber());
		System.out.println("duration:"+c1.getDuration());
	}

}
