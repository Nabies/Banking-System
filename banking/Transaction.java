package banking;

public class Transaction extends Bank
{
	void trans() 
	{
		System.out.println(" For Transation ");
		System.out.println("Enter your bank name: ");
		String bankname=sc.next();
		dd.setBankName(bankname);
		System.out.println("Enter your account number: ");
		String accNo=sc.next();
		try
		{
			if(dd.getAccountNo().equalsIgnoreCase(accNo))
			{
				Process p = new Process();
				p.process();
			}
		}
		catch(Exception e)
		{
			System.out.println("Account number not found \n");
		}	
	}
}
