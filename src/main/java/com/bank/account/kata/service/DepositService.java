package com.bank.account.kata.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.bank.account.kata.entity.Operation;
import com.bank.account.kata.entity.Transactions;

/**
 * @author Clémence LOKO Service d'ajout d'argent sur le compte. L'utilisateur
 *         via ce service ajoute de l'argent sur son compte et consulte le
 *         nouveau montant.
 *
 */
public class DepositService {

	
   /**
 * @param amount
 * @return transactions
 * Mathode permettant de calculer le solde après avoir effectuer un dépot sur le code. 
 * Elle retourne la date, le type de transaction le solde et le montant déposé
 */
public Transactions getAmountAfterDepositMoney(final BigDecimal amount) {
		
		Transactions transaction = new Transactions();
		transaction.setAmount(amount);
		transaction.setBalance(BigDecimal.valueOf(1000));
		transaction.setDate(LocalDate.now());
		transaction.setOperation(Operation.DEPOSIT);
		BigDecimal balance = add(transaction.getAmount(), transaction.getBalance()); 
		transaction.setBalance(balance);
		
		return transaction;
	}
	
	/**
	 * @param deposit
	 * @param balance
	 * @return solde
	 * 
	 * Methode permettant d'additionner la somme a déposer et le solde 
	 */
	public BigDecimal add(BigDecimal deposit, BigDecimal balance) {
		return balance.add(deposit);
	}

}
