
public class Assignment10_1 extends Thread
{
	public void run()
	{
		System.out.print("Thread will be suspended for 500 milliseconds!");
		try 
		{
			sleep(500);
		}
		catch (InterruptedException e) 
		{	
			e.printStackTrace();
		}
		System.out.println("\nThread is running!");
	}

	public static void main(String[] args) 
	{
		Assignment10_1 obj=new Assignment10_1();
		obj.start();
	}

}
