package TestingAss;

import static org.junit.jupiter.api.Assertions.*;

import javax.naming.InsufficientResourcesException;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class InsufficientBalanceTest {

	@Test
	void test() {
		BankAccount b =new BankAccount();
		Assert.assertThrows("Insufiicientbalance", InsufficientBalanceException.class,()->b.withdraw(1800));
	}

}
