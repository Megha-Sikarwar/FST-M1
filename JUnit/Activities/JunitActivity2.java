package tes.java;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class JunitActivity2 {
	@Test
	void notEnoughFunds() {
	    BankAccount account = new BankAccount(10);
	    assertThrows(NotEnoughFundsException.class, () -> account.withdraw(11));
	}
	
	@Test
	void enoughFunds() {
	    BankAccount account = new BankAccount(100);
	    assertDoesNotThrow(() -> account.withdraw(100));
	}
}
