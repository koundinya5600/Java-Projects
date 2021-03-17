	
public class Student {
	private int id;
	private String name;
	private float average;
	private char grade;
	private int marks[];
	public Student(int id,String name,int []marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public char getGrade() {
		return this.grade;
	}
	public int[] getMarks() {
		return this.marks;
	}
	public float getAverage() {
		return this.average;
	}
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setGrade(char c) {
		this.grade=c;
	}
	public void setMarks(int [] a) {
		this.marks=a;
	}
	public void setAverage(int avg) {
		this.average=avg;
	}
	public void calculateAvg() {
		int a = 0;
		for(int i=0;i<this.marks.length;i++) {
			a+=this.marks[i];
		}
		this.average=(float)a/this.marks.length;
	}
	public void findGrade() {
		boolean s=true;
		for(int marks:this.marks) {
			if(marks<50) {
				this.grade='F';	
				s=false;

			}
		}
		if(s) 
		{
			if(this.average>=80 && this.average<=100) {
				this.grade='O';	
			}
			else {
				this.grade='A';	
			}
	}
		
	}
}
