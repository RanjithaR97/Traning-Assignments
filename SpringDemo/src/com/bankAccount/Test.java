package com.bankAccount;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");
		BankAccount bankaccount=(BankAccount) context.getBean("bankAccount");
     System.out.println  (bankaccount.getAccountBalance());
      System.out.println( bankaccount.getAccountHolderName());
       System.out.println(bankaccount.getAccountId());
       System.out.println(bankaccount.getAccountType());
       context.close();
	}

}
