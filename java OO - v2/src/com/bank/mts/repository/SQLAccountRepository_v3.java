package com.bank.mts.repository;

import com.bank.mts.model.Account;
import com.bank.mts.model.AccountType;

/**
 * 
 * @author Pranith
 *
 */

public class SQLAccountRepository_v3 implements SQLAccountRepository {

	public SQLAccountRepository_v3() {
		System.out.println("SQLAccountRepository_v3 instance created..");
	}

	public Account loadAccount(String number) {
		// .....
		System.out.println("loading account " + number);
		Account account = new Account();
		account.setNumber(number);
		account.setBalance(1000.00);
		account.setAccountType(AccountType.SAVING);

		return account;
	}

	public boolean updateAccount(Account account) {
		// ....
		System.out.println("updating account " + account.getNumber());
		return true;
	}

}
