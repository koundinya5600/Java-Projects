import java.util.Scanner;
public class StudentMain {
	public static Student getStudentDetails() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the id:");
		int id=s.nextInt();
		s.nextLine();
		System.out.println("Enter the name:");
		String name=s.nextLine();
		System.out.println("Enter the no of subjects:");
		int sub=s.nextInt();
		while(sub<=0) {
			System.out.println("Invalid number of subject");
			System.out.println("Enter the no of subjects:");
			sub=s.nextInt();
		}
			int []marks = new int[sub];
			int count=1;
			for(int i=0;i<sub;i++) {
				System.out.println("Enter mark for subject "+ count +":");
				int m=s.nextInt();
				while(m<0 || m>100) {
					System.out.println("Invalid Mark");
					System.out.println("Enter mark for subject "+ count +":");
					m=s.nextInt();
				}
						
				marks[i]=m;
				count++;
			}
			Student stu=new Student(id,name,marks);
			stu.calculateAvg();
			stu.findGrade();
			System.out.println("Id:"+stu.getId());
			System.out.println("Name:"+stu.getName());
			System.out.println("Average:"+stu.getAverage());
			System.out.println("Grade:"+stu.getGrade());
		
			
			
		return null;
		
	}

	public static void main(String[] args) {
		StudentMain.getStudentDetails();
	}

}
