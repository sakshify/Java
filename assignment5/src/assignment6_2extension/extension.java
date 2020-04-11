package assignment6_2extension;
import assignment6.*;
public class extension 
{

	public static void main(String[] args) 
	{
		two obj=new two();
		obj.publicshowcase();
		//System.out.println(obj.m);     <--Protected data member can't be accessed from classes outside package
	}

}
