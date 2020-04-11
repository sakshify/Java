package assignment5;
import java.util.Scanner;

abstract class Calculation
{
	float a,b;
	public abstract void add();
	public abstract void subtract();
	public abstract void multiply();
	public abstract void divide();
}


 class one extends Calculation
{
	 public void add()
	 {
		 System.out.println("Addition="+(a+b));
	 }
	 public void subtract()
	 {
		 System.out.println("Subtraction="+(a-b));
	 }
	 public void multiply()
	 {
		 System.out.println("Multiplication="+(a*b));
	 }
	 public void divide()
	 {
		 System.out.println("Division="+(a/b));
	 }
	 public void input()
	 {
		 Scanner ch=new Scanner(System.in);
		 System.out.print("Enter a:");
		 a=ch.nextInt();
		 System.out.print("Enter b:");
		 b=ch.nextInt();
		 ch.close();
	 }
	public static void main(String[] args) 
	{
		one obj=new one();
		obj.input();
		obj.add();
		obj.subtract();
		obj.multiply();
		obj.divide();
	}

}
