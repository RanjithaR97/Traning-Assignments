package TestingAss;

import javax.naming.InsufficientResourcesException;

public class BankAccount {
	
   public void withdraw(int amount) throws InsufficientBalanceException {
	   if(amount<20000) {
		   throw new InsufficientBalanceException();
   }
}
}
