public class Assignment10_3 extends Thread
{
	public static void main(String[] args) 
	{
		call t1=new call();
		call t2= new call();
		call t3= new call();
		t1.start();
		try 
		{
			System.out.println("Current thread: "+Thread.currentThread().getName());          //thread will remain main as start() is never called
			t1.join();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		t2.start();
		try 
		{
			System.out.println("Current thread: "+Thread.currentThread().getName());
			t2.join();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		t3.start();
		
	}
}
 class call extends Thread
{
	
	public void run()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Current thread: "+Thread.currentThread().getName());
	}
}