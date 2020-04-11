import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class Assignment9_a 
{

	public static void main(String[] args) 
	{
		List<String> companies=new ArrayList<String>();
		companies.add("Microsoft");
		companies.add("Google");
		companies.add("Oracle");
		companies.add("Facebook");
		companies.add("Vishwakarma University");
		System.out.println("Counting...");
		try 
		{
			TimeUnit.SECONDS.sleep(1);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Total number of companies= "+companies.size());
	}

}
