package assignment5;
interface drawable
{
	void draw();
}
class Rectangle implements drawable
{
	public void draw()
	{
		System.out.println("Drawing Rectangle!");
	}
}
class Circle implements drawable
{
	public void draw()
	{
		System.out.print("Drawing Circle!");
	}
}
public class two 
{
	
	public static void main(String[] args) 
	{
		drawable obj=new Rectangle();
		drawable obj1=new Circle();
		obj.draw();
		obj1.draw();
	}

}
