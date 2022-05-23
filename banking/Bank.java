package banking;
import java.util.*;


public class Bank 
{
	static Data dd=new Data();
	static 
	{
		System.out.println("	Weclome to Banking Application  \n");
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int y=1;	
		do
		{
			enterBank();
			System.out.println("Do you want Continue with Bank ");
			System.out.println(" 1. YES \n 2. NO");
			y=sc.nextInt();		
		}
		while(y!=2);
		System.out.println("Thankyou):");
	}
	public static void enterBank() 
	{
		int ch;
		Account a = new Account();
		Details loan=new Details();
		Transaction t=new Transaction();
		System.out.println("Choose the bank to perform action: \n 1. HDFC Bank \n 2. SBI Bank \n 3. ICICI Bank \n 4. IOB Bank \n 5. Loan Section \n 6. Proceed to Transaction ");
		ch = sc.nextInt();
		switch(ch)
		{
			case 1:
					a.openAcc();
					System.out.println("HDFC  bank Account  is successfully created");
					System.out.println("Your intreast is 2% \n");
					break;
			case 2:
					a.openAcc();
					System.out.println("SBI  bank Account is successfully created");
					System.out.println("Your intreast is 3% \n");
					break;
			case 3:
					a.openAcc();
					System.out.println("ICICI  bank Account is successfully created");
					System.out.println("Your intreast is 4% \n");
					break;
			case 4:
					a.openAcc();
					System.out.println("IOB  bank Account  is successfully created");
					System.out.println("Your intreast is 5% \n");
					break;
			case 5:
					System.out.println(" Welcome to Loan Section ");
					loan.openLoanAcc();
					break;		
			default:
					System.out.println("Processing....");
					t.trans();
					break;		
		}		
	}		
}



