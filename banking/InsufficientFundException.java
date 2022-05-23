package banking;
@SuppressWarnings("serial")
public class InsufficientFundException extends Exception
{
	int amount;
	public InsufficientFundException(int amt)
	{
			amount=amt;
	}
}
