package yash;

public class Thiskeyword {
int m=12;
	public Thiskeyword() 
	{
		System.out.print("\nDisplayed from default constructor!");
	}
	public Thiskeyword(int m)
	{
		this();
		System.out.print("\nDisplayed from parameterized constructor!");
	}
	void display()
	{
		System.out.print("\nDisplayed from Display method");
		this.display2();
		System.out.print("\n"+this.m);
	}
	void display2()
	{
		System.out.print("\nDisplayed from Second Display method");
	}

	public static void main(String[] args) 
	{
		Thiskeyword obj=new Thiskeyword(5);
		obj.display();
	}

}
