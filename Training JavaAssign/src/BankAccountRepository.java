package com.bankAccount;

import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountRepository {

	public double getBalance( long accountId) ;
	
	
	public double updateBalance(long accountId,double newbalance);
	
}
