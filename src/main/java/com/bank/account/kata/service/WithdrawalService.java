package com.bank.account.kata.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.bank.account.kata.entity.Operation;
import com.bank.account.kata.entity.Transactions;

/**
 * @author Clémence LOKO
 * Classe permettant d'effectuer des retrait sur le compte
 */
public class WithdrawalService {
	
	/**
	 * @param amount
	 * @return transactions
	 * 
	 * Methode permettant d'effectuer des retrait et de retourner le solde du compte, le montant retirer, la date et le type d'opération
	 */
	public Transactions getAmountAfterWithdrawalMoney(final BigDecimal amount) {
		
		Transactions transactions = new Transactions();
		transactions.setBalance(BigDecimal.valueOf(3547.88));
		transactions.setAmount(amount);
		BigDecimal balance = substractBigDecimal(amount, transactions.getBalance());
		transactions.setBalance(balance);
		transactions.setDate(LocalDate.now());
		transactions.setOperation(Operation.WITHDRAWAL);
		return transactions;
	}
	
	/**
	 * @param withdrawal
	 * @param balance
	 * @return Solde
	 * 
	 * Methode permettant de calculer le solde apèrs avoir effectuer un retrait
	 */
	public BigDecimal substractBigDecimal(final BigDecimal withdrawal, final BigDecimal balance) {		
		return balance.subtract(withdrawal);
	}

}
