package yash;
import java.util.Scanner;
public class Assignment2_2 
{
	 public static void main(String[] args) 
	    {
	        Scanner inp= new Scanner(System.in);
	        System.out.print("Enter a Number: ");
	        int n=inp.nextInt();
	        num a=new num();
	        a.op(n);
	        
	    }
}
class num
{
	void op(int n)
	{
		if(n>0)
	        System.out.print("positive");
	    if(n<0)
	        System.out.println("Negative");
	    if(n==0)
	        System.out.println("Zero");
	}
	
}
