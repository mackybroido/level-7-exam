import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;


public class BankTest {

	@Test
	public void testCalculateInterest() {
		Bank bank = new Bank();
		Calendar cal = Calendar.getInstance();
	    Date todayDate = new Date();
	    cal.setTime(todayDate);
	    cal.set(Calendar.HOUR_OF_DAY, 0);
	    cal.set(Calendar.MINUTE, 0);
	    cal.set(Calendar.SECOND, 0);
	    cal.set(Calendar.MILLISECOND, 0);
	    todayDate = cal.getTime();
		BankAccount bankAccount = new BankAccount(todayDate, 100);
		assertEquals(2.54, bank.calculateInterest(bankAccount), .1);
	}
	
	@Test
	public void testListOfBankAccounts(){
		Calendar cal = Calendar.getInstance();
	    Date todayDate = new Date();
	    cal.setTime(todayDate);
	    cal.set(Calendar.HOUR_OF_DAY, 0);
	    cal.set(Calendar.MINUTE, 0);
	    cal.set(Calendar.SECOND, 0);
	    cal.set(Calendar.MILLISECOND, 0);
	    todayDate = cal.getTime();
	    Bank bank = new Bank();
		ArrayList accounts = new ArrayList<BankAccount>();
		accounts.add(0, new BankAccount(todayDate, 100));
		accounts.add(1, new BankAccount(todayDate, 1000));
		accounts.add(2, new BankAccount(todayDate, 10));
		bank.updateBalances(accounts);
		//assertEquals(102.54, accounts.get(0).getBalance());
	}

}
