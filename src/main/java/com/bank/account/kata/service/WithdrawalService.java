package com.bank.account.kata.service;

import java.math.BigDecimal;

import com.bank.account.kata.entity.Transactions;

public class WithdrawalService {
	
	public Transactions getAmountAfterWithdrawalMoney(final BigDecimal amount) {
		
		Transactions transactions = new Transactions();
		transactions.setBalance(BigDecimal.valueOf(3547.88));
		transactions.setAmount(amount);
		BigDecimal balance = substractBigDecimal(amount, transactions.getBalance());
		transactions.setBalance(balance);
		return transactions;
	}
	
	public BigDecimal substractBigDecimal(final BigDecimal withdrawal, final BigDecimal balance) {		
		return balance.subtract(withdrawal);
	}

}
