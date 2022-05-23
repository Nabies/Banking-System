package banking;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Account extends Bank 
{
    static Scanner sc2 = new Scanner(System.in);
    public void openAcc() 
    {
    	System.out.println("Enter name: ");
    	dd.setName(sc2.next());
        System.out.println("Enter Phone Number:");
        dd.setPhoneno(sc2.next());
        System.out.println("Enter Pan Number:");
        dd.setPanNo(sc2.next());
        System.out.println("Enter email for further notification :");
        dd.setEmail(sc2.next());
        System.out.println("Enter your Address for card delevering :");
        dd.setAddress(sc2.next());
        System.out.print("Account No :");
        int k;
        LocalDateTime myDate = LocalDateTime.now();
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a"+"\n");
        String formattedDate = myDate.format(myFormat);
        Random rand=new Random();
        k=rand.nextInt();
        String accountNo=String.valueOf(Math.abs(k));
        dd.setAccountNo(accountNo);
        System.out.println(accountNo+" Created on "+formattedDate);
    	System.out.println("Minimum Deposit is 10000 ");
        System.out.println("Deposit: ");
        dd.setAccountBalance(sc2.nextInt());
        if(dd.getAccountBalance()>=10000)
        {
    		System.out.println("Sucessfuly Deposited");
    	}
        else 
        {
        	System.out.println("Please deposit 10000/-");
        	openAcc();
        }
        
	}
	void showBankDetails()
	{
		System.out.println(  dd.getName()+"  Bank Detail "  );
        System.out.println("Account number: "+dd.getAccountNo());
        System.out.println("Name: " + dd.getName());
        System.out.println("Phone Number:"+ dd.getPhoneno());
        System.out.println("Pan Number:"+ dd.getPanNo());
        System.out.println("Email :"+dd.getEmail());
        System.out.println("Address :"+dd.getAddress());
        System.out.println("Balance Amount: Rs/- " + dd.getAccountBalance());
	 }
	 void showLoanDetails() 
	 {
			System.out.println(dd.getName()+"  Loan Detail  ");
			System.out.println("Bank Name:"+dd.getBankName());
		 	System.out.println("Loan Account number: "+dd.getLoanAccountNo());
		 	System.out.println("Loan Amount:"+dd.getLoanAmount());
	        System.out.println("Name: " + dd.getName());
	        System.out.println("Phone Number:"+ dd.getPhoneno());
	        System.out.println("Pan Number:"+ dd.getPanNo());
	        System.out.println("Email :"+dd.getEmail());
	        System.out.println("Address :"+dd.getAddress());
	        
	 }
	 void downloadSoftcopy()
	 {
		  System.out.println(" 1. BankDetail \n 2. LoanDetail \n 3. Exit");
		  int ch=sc.nextInt();
		  switch(ch)
		  {
		  	case 1:
		  			showBankDetails();
		  			System.out.println("     Print    \n");
		  			break;
		  	case 2:
		  			showLoanDetails();
		  			System.out.println("     Print    \n");
		  			break;
		  	default:
		  			System.out.println("Thankyou):");
		  			break;
		  }
		  
	 }	
}