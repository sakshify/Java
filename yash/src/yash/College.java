package yash;
import java.util.Scanner;
public class College {
static public String college="VJTI";
int roll;
String name;
public void display(College obj)
{
	System.out.print("\nName: "+obj.name+"\nRoll no.: "+obj.roll+"\nCollege: "+obj.college);
}
public void input()
{
	Scanner inp = new Scanner(System.in);
	System.out.print("Enter roll no.:\n");
	roll=inp.nextInt();
	Scanner inp2=new Scanner(System.in);
	System.out.print("\nEnter name: ");
	name=inp2.nextLine();
	
}
	public static void main(String[] args) 
	{
		College obj1=new College();
		College obj2=new College();
		obj1.input();
		obj2.input();
		obj1.display(obj1);
		obj2.display(obj2);
	}

}
