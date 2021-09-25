package Question2;
import Question2.Account;
import Question2.Transaction;
import Question2.InsufficientBalanceException;
import java.time.LocalDate;

public class main 
{

	public static void main(String[] args)
	{
	LocalDate d = LocalDate.now();
	System.out.println(d.getDayOfMonth()+"/"+d.getMonthValue()+"/"+d.getYear());
	
		Account a1 = new Account(777,"Gopinath",10000);
        try
        {
        	Transaction.withdraw(a1,4000);
        }
        catch(InsufficientBalanceException ex)
        {
        	System.out.println(ex.getMessage());
        }
        System.out.println("After Transaction Balance is "+a1.getBalance());
	}

}