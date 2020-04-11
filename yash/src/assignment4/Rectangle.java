package assignment4;
//import java.util.Scanner;
public class Rectangle 
{
	
int length,breadth;
static int i;
public Rectangle(int l,int b)
{
	this.length=l;
	this.breadth=b;
	this.area();
	this.perim();
}
	
	void area()
	{
		System.out.print("Area="+(length*breadth));
	}
	void perim()
	{
		System.out.print("Perimeter="+(2*(length+breadth)));
	}

	public static void main(String[] args) 
	{
		square obj=new square(5);
		/*for(i=0;i<10;i++)
		{
		obj[i].input(i);
		obj[i].areasq();
		obj[i].perimeter();
		}*/
		obj.areasq();
		obj.perimeter();
	}

}
class square extends Rectangle
{
	int side;
	square(int s/*i*/)
	{
		/*Scanner sd=new Scanner(System.in);
		System.out.print("Enter side for square"+i);
		side=sd.nextInt();*/
		super(s,s);
		this.side=s;
	}
	
	 void areasq()
	 {
		 System.out.print("Area of square="+(side*side));
	 }
	 void perimeter()
	 {
		 System.out.print("Perimeter of a square="+(4*length));
	 }
}