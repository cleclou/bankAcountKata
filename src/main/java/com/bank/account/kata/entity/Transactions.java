package com.bank.account.kata.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author Clemence LOKO
 * Classe transactions - objet metier contenant le montant de l'op�ration et le solde sur le compte
 *
 */
public class Transactions {
	
	
	private BigDecimal amount;
	
	private BigDecimal balance;
	
	
	public Transactions() {
		super();
	}

	public Transactions(BigDecimal amount, BigDecimal balance) {
		super();
		this.amount = amount;
		this.balance = balance;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Transactions [amount=" + amount + ", balance=" + balance + "]";
	}
	

	

}
