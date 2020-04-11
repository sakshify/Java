package yash;
import java.util.Scanner;

public class BankAccount {
static String name;
static int AccountNumber;
public static int Balanceamount;
	public BankAccount(int n) 
	{
		switch(n)
		{
		case 1:
		input();
		break;
		case 2:
			deposit();
			break;
		case 3:
			checkbalance();
			break;
		case 4:
			info();
			break;
		}
	}
	public static void input()
	{
		Scanner anum=new Scanner(System.in);
		System.out.print("Enter name of the Account holder: ");
		name=anum.nextLine();
		Scanner aname=new Scanner(System.in);
		System.out.print("\nEnter Account number: ");
		Scanner anum1=new Scanner(System.in);
		AccountNumber=anum1.nextInt();
		
	}
	public static int deposit()
	{
		Scanner amount=new Scanner(System.in);
		System.out.print("\nYour total Deposit Amount= ");
	    Balanceamount=amount.nextInt();
	    return Balanceamount;
	}
	public static void checkbalance()
	{
		Scanner ch=new Scanner(System.in);
		System.out.print("Your total balance is: "+Balanceamount+" .Do you want to withdraw money?\n1)Yes\n2)No\n");
		int choice=ch.nextInt();
		if(choice==1)
		{
			System.out.print("Enter the amount you want to withdraw: ");
			Scanner am=new Scanner(System.in);
			int am2=am.nextInt();
			if(am2<Balanceamount)
			Balanceamount = (Balanceamount-am2);
			else
				System.out.print("\nInsufficient Funds!");
			System.out.print("\nRemaining balance= "+Balanceamount);
		}
	}
	public void info()
	{
		System.out.print("\nName of Account holder: "+name+"\n");
		System.out.print("Account No.= "+AccountNumber);
		System.out.print("\nBalance in account= "+Balanceamount);
	}
	public static void main(String[] args) 
	{
		int ch0=0;
		while(ch0!=5)
		{
			Scanner in=new Scanner(System.in);
			System.out.print("\nChoose one of the following:\n1) Assign initial values\n2) Deposit amount\n3) Check balance and withdraw amount\n4) Display Account information\n 5)Exit");
			 ch0=in.nextInt();
			switch(ch0)
			{
			case 1:
				BankAccount obj=new BankAccount(1);
				break;
			case 2:
				BankAccount obj2=new BankAccount(2);
				break;
			case 3:
				BankAccount obj3=new BankAccount(3);
				break;
			case 4:
				BankAccount obj4=new BankAccount(4);
			}
			
		}
	}

}
