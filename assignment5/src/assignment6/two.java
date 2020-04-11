package assignment6;

public class two 
{
	int d=5;
	private int c=0;
	protected int m=d+15;
	public int a=10,b=30;  //in another package
	

	public static void main(String[] args) 
	{
		add obj=new add();
		obj.display();
	}
	public void publicshowcase()
	{
		System.out.println("Addition="+(a+b));
	}

}
class add extends two
{
	void display()
	{
		System.out.print("Default="+d);
		//System.out.println("Private="+c);   //<--- Will throw compile-time error coz private access
		System.out.println("Protected="+m);
		System.out.println("Public="+a+" "+b);
	}
}
