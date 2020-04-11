package assignment6;
interface A
{
	void a();
	void b();
	void c();
	void d();
}
abstract class B implements A
{
	public void c()
	{
		System.out.println("method c is called!");
		
	}
}
class M extends B
{
public	void  a()
	{
	System.out.println("method a is called!");
	}
	public void b()
	{
		System.out.println("method b is called!");
	}
	public void d()
	{
		System.out.println("method d is called!");
	}
}
public class First {

	public static void main(String[] args) 
	{
		A obj=new M();
		obj.c();
		obj.a();
		obj.b();
		obj.d();
	}

}
