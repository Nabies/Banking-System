package banking;
import java.util.*;

public class Process extends Bank 
{
	Scanner sc=new Scanner(System.in);
        Account a = new Account();
        Deposit d = new Deposit();
		Withdraw w = new Withdraw();
        void process()
        {
        	int ch;
        	do
        	{
        		System.out.println("Welcome to the " + dd.getBankName() + " Bank");
        		System.out.println(" 1. Display Bank details \n 2. Deposit  \n 3. Withdraw  \n 4. Exit");
        		System.out.println("Enter an option to continue: ");
        		ch = sc.nextInt();
        		switch(ch)
        		{
					case 1:
						a.showBankDetails();
						break;
					case 2:
						d.deposit();
						break;
					case 3:
						w.withdraw();
						break;
					default:
						System.out.println("Thank You):");
						break;
        		}
        	}
        	while(ch != 4);
        	enterBank();
        }
}
