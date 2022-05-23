package banking;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Withdraw extends Bank 
{
	Scanner sc=new Scanner(System.in);
	int wAmount;
	void withdraw()
	{
		int ch;
		System.out.println("1. Need to Withdrawn Amount");
		System.out.println("2. View balance");
		ch = sc.nextInt();
		switch(ch)
		{
			case 1:
				try 
				{
					System.out.println("Amount to Withdrawn: ");
					wAmount = sc.nextInt();
					if(dd.getAccountBalance()<=wAmount) 
					throw new InsufficientFundException(wAmount-dd.getAccountBalance());
				}
				catch(InsufficientFundException e) 
				{
					System.out.println("Account Balance is insufficient");
					break;
				}
				try 
				{
					if(wAmount >= dd.getAccountBalance()) 
					{
						throw new InsufficientFundException(wAmount-dd.getAccountBalance()); 
					    	
					}
					else
					{
						int accountBalance = dd.getAccountBalance() - wAmount;
						dd.setAccountBalance(accountBalance);
						LocalDateTime myDate = LocalDateTime.now();
				        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a"+"\n");
				        String formattedDate = myDate.format(myFormat);
				        System.out.println("You have Withdrawn "+ wAmount +" on "+ formattedDate);
				        System.out.println("Total balance of your account: Rs/- " + dd.getAccountBalance()+"\n");
						break;
					}
				}
				catch(InsufficientFundException e)
				{
					System.out.println("Account Balance is insufficient):");
				}
			case 2:
				System.out.println("Total balance of your account: Rs/- " + dd.getAccountBalance()+"\n");
				break;
		}
	}		
}
