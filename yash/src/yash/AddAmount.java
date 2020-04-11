package yash;

public class AddAmount {
int amount=50;
	public AddAmount() 
	{
		System.out.print("\nNo amount is added to the Piggie bank! Balance in account is: "+" "+amount);
	}
	public AddAmount(int n) 
	{
		amount=amount+n;
		System.out.print("\nAmount successfully added to the Piggie bank! Balance in account is: "+" "+amount);
	}

	public static void main(String[] args) 
	{
		AddAmount obj=new AddAmount();
	}

}
