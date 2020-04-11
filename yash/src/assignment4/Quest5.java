package assignment4;
import java.util.Scanner;
import java.io.*;
public class Quest5 {
	  Operation op  = new Operation();;
	    int temp;
	    final double pi =3.14;
	public Quest5() 
	{
		 int temp = op.square(3);
	      System.out.println("Area = "+ (temp*pi));
	}

	public static void main(String[] args) 
	{
        new Quest5();
	}

}

class Operation{
    int square(int n)
    {
        return n*n;
    }
}