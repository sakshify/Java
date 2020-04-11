package yash;
import java.util.Scanner;
public class Assignment2_1 
{
	public static void main(String args[])
	{
		Scanner marks=new Scanner(System.in);
		System.out.println("Enter marks=");
		int Marks=marks.nextInt();
		result a=new result();
		a.marks(Marks);
		
	}
}
class result
{
	void marks(int Marks)
	{
		if(Marks<50)
			System.out.print("Sorry, you're failed!");
		else if(Marks>=50&&Marks<60)
			System.out.print("You've scored 'D' grade. Congratulations! ");
		else if(Marks>=60&&Marks<70)
			System.out.print("You've scored 'C' grade. Congratulations! ");
		else if(Marks>=70&&Marks<80)
			System.out.print("You've scored 'B' grade. Congratulations! ");
		else if(Marks>=80&&Marks<90)
			System.out.print("You've scored 'A' grade. Congratulations! ");
		else if(Marks>=90&&Marks<100)
			System.out.print("You've scored 'A+' grade. Congratulations! ");
		else if(Marks>100)
			System.out.print("Incorrect input! Please enter correct Marks!");
	}
}
