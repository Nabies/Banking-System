package banking;
import java.util.Scanner;

public class Deposit extends Bank 
{
	Scanner sc=new Scanner(System.in);
	int dAmount;
	void deposit()
	{	
		int ch;
		System.out.println("1. Enter the deposit amount");
		System.out.println("2. View balance ");
		ch = sc.nextInt();
		switch(ch)
		{
			case 1:
					System.out.println("Enter Amount :");
					Scanner sc1 = new Scanner(System.in);
					dAmount = sc1.nextInt();
					int accountBalance = dd.getAccountBalance() + dAmount;
					dd.setAccountBalance(accountBalance);
					System.out.println("Deposited Successfully");
					System.out.println("Total balance of your account: Rs/- " + dd.getAccountBalance()+"\n");
					break;
			case 2:
					System.out.println("Total balance of your account: Rs/- " + dd.getAccountBalance()+"\n");
					break;
			
		}
	}
}
