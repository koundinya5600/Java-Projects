import java.util.Scanner;
public class UniqueChar {
	static void distinctchar(String str)
	{
		str = str.replaceAll("\\s", "");
		int []counter=new int[256];
		int i,c;
			for( i=0;i<str.length();i++) 
				{
					//System.out.println((int)str.charAt(i));
					if(str.charAt(i)!=' ' && (int)str.charAt(i)>64)
					{
						
						counter[(int)str.charAt(i)]++;
					}
					else
					{
						System.out.println("Invalid Sentence");
						System.exit(0);
					}
				}	
			
			int m=i;
			int count=0;
			for(i=0;i<m;i++) 
			{
				if(counter[(int)str.charAt(i)]==1)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println("No Unique Characters");
			}
			else
			{
				System.out.println("Unique Characters:");
				for(i=0;i<m;i++) 
					{
						if(counter[(int)str.charAt(i)]==1)
						{
							System.out.println(str.charAt(i));
						}
					}
			}
			}
		
	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the sentence");
			String str=s.nextLine();
			distinctchar(str);
	}

}
