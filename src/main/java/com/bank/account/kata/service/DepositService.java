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

	public Transactions getAmountAfterDepositMoney() {

		Transactions transaction = new Transactions();
		BigDecimal balance = add(transaction.getAmount());
		transaction.setBalance(balance);

		return transaction;
	}

	public BigDecimal add(BigDecimal deposit) {
		BigDecimal amount = BigDecimal.valueOf(2100);
		return amount.add(deposit);
	}

}
