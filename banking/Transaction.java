package banking;

public class Transaction extends Bank
{
	  void trans() 
	  {
			Account a=new Account();
			int ch;
			System.out.println(" 1. Bank Transaction \n 2. Loan Transaction \n 3. Exit");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				{
					System.out.println(" For Bank Transation ");
					System.out.println("Enter your bank name: ");
					String bankname=sc.next();
					dd.setBankName(bankname);
					System.out.println("Enter your Account number: ");
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
					break;
				}
				case 2:
				{
					System.out.println("For Loan Transaction");
					System.out.println("Enter your bank name: ");
					String bankname1=sc.next();
					dd.setBankName(bankname1);
					System.out.println("Enter your Loan account number: ");
					String loanAccountNo=sc.next();
					try
					 {
						if(dd.getLoanAccountNo().equalsIgnoreCase(loanAccountNo))
						{
							a.showLoanDetails();
						}
					}
					catch(Exception e)
					{
						System.out.println("Loan Account number not found \n");
					}
					break;
				}
				default:
				{
					System.out.println("Thankyou):");
				}
			}
		}
}

