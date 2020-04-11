import java.util.*;
import java.util.concurrent.TimeUnit;
public class Assignment9_d 
{
int num,c;
	public static void main(String[] args) 
	{
		Queue<Integer> queue=new LinkedList<Integer>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		queue.add(60);
		queue.add(70);
		System.out.print("\tQueue = "+queue);
		System.out.println("\nChoose one of the following\n1)Remove()\n2)Element()\n3)Poll\n4)Peek()\n");
		Scanner i=new Scanner(System.in);
		int c=i.nextInt();
		i.close();
		switch(c)
		{
		case 1:
			System.out.println("Deleting head of the queue ...");
			queue.remove();
			try 
			{
				TimeUnit.SECONDS.sleep(1);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.print("Removed! Queue elements after removal= "+queue);
			break;
		case 2:
			System.out.print("Head of the Queue = "+queue.element());
			break;
		case 3:
			System.out.println("Queue before = "+queue);
			System.out.println("Head of the queue using poll method = "+queue.poll());
			System.out.println("Queue after = "+queue);
			break;
		case 4:
			System.out.println("Queue before = "+queue);
			System.out.println("Head of the queue using peek method = "+queue.peek());
			System.out.println("Queue after = "+queue);
			break;
		default:
				System.out.println("Incorrect option! Please try again.");
				break;
		}

	}

}
