import java.util.Scanner;
public class Associate 
{
	private int associateId;
	private String associateName;
	private String workStatus;
	
	public void setAssociateId(int id)
	{
		this.associateId=id;
	}
	public void setAssociateName(String name)
	{
		this.associateName=name;
	}
	public void setWorkStatus(String status)
	{
		this.workStatus=status;
	}
	public int getAssociateId()
	{
		return this.associateId;
	}
	public String getAssociateName()
	{
		return this.associateName;
	}
	public String getWorkStatus()
	{
		return this.workStatus;
	}
	public void trackAssociateStatus(int num)
	{
		    if(num>0 && num<=20) {
				this.workStatus="Core skills";
				System.out.println("The associate " + this.associateName+" work status:" + this.workStatus);
			}
			else if(num>20 && num<=40) {
				this.workStatus="Advanced modules";
				System.out.println("The associate " + this.associateName+" work status:" + this.workStatus);
	
			}
			else if(num>60) {
				this.workStatus="Deployed in project";
				System.out.println("The associate " + this.associateName+" work status:" + this.workStatus);
	
			}
			else if(num>40 && num<=60) {
				this.workStatus="Project phase";
				System.out.println("The associate " + this.associateName+" work status:" + this.workStatus);
	
			}
		}

	

}
