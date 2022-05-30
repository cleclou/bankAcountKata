package com.bank.account.kata.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author Clémence LOKO
 * Classe transactions - objet métier contenant le montant de l'opération et le solde sur le compte
 *
 */
public class Transactions {
	
	private LocalDate date;
	
	private Operation operation;
	
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
	

	public Transactions(LocalDate date, Operation operation, BigDecimal amount, BigDecimal balance) {
		super();
		this.date = date;
		this.operation = operation;
		this.amount = amount;
		this.balance = balance;
	}

		
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Operation getOperation() {
		return operation;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
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
		return "Transactions [date=" + date + ", operation=" + operation + ", amount=" + amount + ", balance=" + balance
				+ "]";
	}
	

	

}
