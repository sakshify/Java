import java.util.*;
public class Assignment9_b {

	public static void main(String[] args) 
	{
		List<String> countries=new ArrayList<String>();
		countries.add("India");
		countries.add("USA");
		countries.add("Syria");
		countries.add("Pakistan");
		Collections.sort(countries);
		System.out.println("Countries in alphabetical order= "+countries);
	}

}
