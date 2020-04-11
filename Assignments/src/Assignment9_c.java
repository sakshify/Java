import java.util.*;
import java.util.concurrent.TimeUnit;
public class Assignment9_c 
{
	public static void main(String[] args) 
	{
		LinkedList<String> items=new LinkedList<String>();
		items.add("Item 1");
		items.add("Item 2");
		items.add("Item 3");
		items.add("Item 4");
		items.add("Item 5");
		System.out.println("LinkedList before removal = "+items);
		System.out.println("Deleting Item 4...");
		try 
		{
			TimeUnit.SECONDS.sleep(1);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		items.remove("Item 4");
		System.out.println("\nLinkedList after removal = "+items);
	}

}
