package yash;
import java.util.Scanner;
public class Assignment2_4 
{

	public static void main(String[] args) 
	{
		Scanner pyr= new Scanner(System.in);
        System.out.print("\nEnter a number:");
        int n=pyr.nextInt();
        star a=new star();
        a.dis(n);
        

    }
}
class star
{
	void dis(int n)
	{
		int i,j;
        for(i=1;i<=n;i++)
        { 
            for(j=0;j<i;j++)
            {
            	if (i%2==0)
                System.out.print("*");            
            }
            System.out.print("\n");
	    }
	}
}