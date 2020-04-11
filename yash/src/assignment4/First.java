package assignment4;
import java.util.Scanner;
public class First {

int id;
String name;
    First(int id)
    {
    	this.id=id;
    	
    }
	public static void main(String[] args) 
	{
		Scanner ch=new Scanner(System.in);
		/*System.out.print("\nEnter Employee ID: ");
		int id=ch.nextInt();*/
		Scanner n=new Scanner(System.in);
		
		System.out.print("\nEnter Employee name: ");
		
		String name=n.nextLine();
		//System.out.print(name);
		//First obj1=new First();
		Emp obj=new Emp();
		obj.display(name);
		ch.close();
		n.close();
	}

}
class Emp extends First
{
	int salary;
    Emp()
	{
    	super(1);  
		Scanner s=new  Scanner(System.in);
		System.out.print("\nSalary de");
		salary=s.nextInt();
		s.close();
	}

	void display(String name)
	{
		System.out.print(super.id+name+salary);
	}
}
