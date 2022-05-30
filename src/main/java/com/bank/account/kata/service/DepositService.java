package com.bank.account.kata.service;

import java.math.BigDecimal;

import com.bank.account.kata.entity.Transactions;

/**
 * @author Clémence LOKO Service d'ajout d'argent sur le compte. L'utilisateur
 *         via ce service ajoute de l'argent sur son compte et consulte le
 *         nouveau montant.
 *
 */
public class DepositService {

   public Transactions getAmountAfterDepositMoney(final BigDecimal amount) {
		
		Transactions transaction = new Transactions();
		transaction.setAmount(amount);
		transaction.setBalance(BigDecimal.valueOf(1000));
		BigDecimal balance = add(transaction.getAmount(), transaction.getBalance()); 
		transaction.setBalance(balance);
		
		return transaction;
	}
	
	public BigDecimal add(BigDecimal deposit, BigDecimal balance) {
		return balance.add(deposit);
	}

}
