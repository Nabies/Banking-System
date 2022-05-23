package banking;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public interface Loan 
{
	void openLoanAcc();
	
}
class Details extends Bank implements Loan 
{
		static Scanner sc=new Scanner(System.in);
		Account a=new Account();
	public void openLoanAcc() 
    {
		 System.out.println("Are you Existing Customer?");
		 System.out.println(" 1. YES\n 2. NO");
		 int ch=sc.nextInt();
		 switch(ch) 
		 {
		 	case 1:
		 	{
			 	System.out.println(" 1. Get Loan \n 2. Download info");
			 	ch=sc.nextInt();
			 	switch(ch) 
			 	{
		 			case 1:
		 			{
						System.out.println("Enter your bank name: ");
						dd.setBankName(sc.next());
						System.out.println("Enter your account number: ");
						try 
						{
								String accNo=sc.next();
								if(dd.getAccountNo().equalsIgnoreCase(accNo)) 
								{
									System.out.println("Account number Matches \n Proceeding for Loan");
								}
						}
						catch(Exception e)
						{
							System.out.println("Account Not Found");
							enterBank();
						}
						System.out.println("Enter Loan Amount:");
						dd.setLoanAmount(sc.nextInt());
						if(dd.getLoanAmount()>1000000) 
						{
							System.out.println("Monthly Due Amount :"+dd.getLoanAmount()*12/100);
						}
						else 
						{
							System.out.println("Monthy due Amount :"+dd.getLoanAmount()*6/100);
						}
						System.out.println("Please submit the orignal property or gold for the Loan");
						System.out.println("Our Employee will touch with you shortly):");
						System.out.print("Loan Account No :");
						int k;
						LocalDateTime myDate = LocalDateTime.now();
						DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a"+"\n");
						String formattedDate = myDate.format(myFormat);
						Random rand=new Random();
						k=rand.nextInt();
						String loanAccountNo=String.valueOf(Math.abs(k));
						dd.setLoanAccountNo(loanAccountNo);
						System.out.println(loanAccountNo+" Created on "+formattedDate);
						a.showLoanDetails();
						break;
			 		}
		 			case 2:
		 			{
		 				a.downloadSoftcopy();
		 			 	break;
		 			}
			 	}
		 	}
		 case 2:
		 {
			 System.out.println("Thankyou):");
			break;
		 }
		}
    }	
	public void loanDetails()  
	{
		System.out.println("");
		int ch=sc.nextInt();
		switch(ch) 
		{
			
		}
		
	}
}
	
	



