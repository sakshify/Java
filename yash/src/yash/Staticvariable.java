package yash;

public class Staticvariable {
int a=2;
public static int b=7;

	public void m1()
	{
		System.out.print("THe value of non static variable is: "+a);
		System.out.print("\nValue of static variable is: "+b);
		b=10;
		a=12;
		System.out.print("THe value of non static variable is: "+a);
		System.out.print("\nValue of static variable is: "+b);
	}
	public static void m2()
	{
		System.out.print("THe value of non static variable is: ");
		System.out.print("\nValue of static variable is: "+b);
		b=100;
		//a=12;
		System.out.print("\nValue of static variable is: "+b);
	}

	public static void main(String[] args) 
	{
		Staticvariable obj=new Staticvariable();
		obj.m1();
		obj.m2();
	}

}
