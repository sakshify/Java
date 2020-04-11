package assignment6;
import java.util.Scanner;
public class three 
{
	
	void exception()
	{
		try 
		{
		int ar[]=new int[-2],i;
		
			Scanner ex=new Scanner(System.in);
			for(i=0;i<3;i++)
			{
				System.out.print("Enter "+i+"th element");
				ar[i]=ex.nextInt();

			}
			ex.close();
		}
		
	catch(NegativeArraySizeException m)
	{
		System.out.println("Exception handling working! The array is negative sized.");
	}
		
		catch(ArrayIndexOutOfBoundsException m)
		{
			System.out.println("Exception handling working! The array index is out of bounds.");
		}
		
		
	}
	public static void main(String[] args) 
	{
		three obj=new three();
		obj.exception();
	}

}
