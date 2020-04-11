package assignment4;

public class Quest4 {

		    //float interest_rate;
		    double getRateOfInterest()
		    {
		        return 12;
		    }
		    public static void main(String args[])
		    {
		        Quest4 sbi = new SBI();
		        Quest4 icici = new ICICI();
		        Quest4 axis = new AXIS();
		        Quest4 bank = new Quest4();
		        double interest = sbi.getRateOfInterest();
		        System.out.println("SBI interest = "+interest);
		        interest =icici.getRateOfInterest();
		        System.out.println("ICICI interest = "+interest);
		        interest = axis.getRateOfInterest();
		        System.out.println("AXIS interest = "+interest);
		        interest = bank.getRateOfInterest();
		        System.out.println("My bank interest = "+interest);
		    }

		
	}


class AXIS extends Quest4
{
    double getRateOfInterest()
    {
        return 6.3;
    }
}
class ICICI extends Quest4
{
    double getRateOfInterest()
    {
        return 6.2;
    }
}
class SBI extends Quest4
{
    double getRateOfInterest()
    {
        return 10;
    }
}
