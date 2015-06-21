import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;


public class BankTest {

	@Test
	public void test() {
		Bank bank = new Bank();
		BankAccount bankAccount = new BankAccount(new Date(114, 6, 21), 1000);
		ArrayList<BankAccount> accountList = new ArrayList();
		accountList.add(bankAccount);
		bank.updateBalances(accountList);
		assertEquals(1025.40, accountList.get(0).money, .01);
	}

}
