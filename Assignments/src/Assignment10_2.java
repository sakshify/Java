
public class Assignment10_2 extends Thread
{

	public static void main(String[] args)
	{
		Thread obj= Thread.currentThread();
		System.out.println("Name of the thread: "+obj.getName());
		System.out.println("Priority of the thread: "+obj.getPriority());
		obj.setPriority(MIN_PRIORITY);
		System.out.println("Priority of the thread after resetting: "+obj.getPriority());
	}

}
