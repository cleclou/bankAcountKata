package com.bank.account.kata.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import com.bank.account.kata.entity.Operation;
import com.bank.account.kata.entity.Transactions;

/**
 * @author Clémence LOKO
 * Classe permettant à l'utilisateur de consulter l'historique de ces transactions
 */
public class HistoryService {
	
	Transactions transaction;
	
	/**
	 * @return list des transactions
	 * Methode permettant de retourner la liste des différentes transactions effectuer sur la compte
	 */
	public List<Transactions> getHistoryTransactions() {
		List<Transactions> list = new ArrayList<>();
		transaction = new Transactions(LocalDate.now(), Operation.WITHDRAWAL,
				BigDecimal.valueOf(400), BigDecimal.valueOf(2500));
		list.add(transaction);
		transaction = new Transactions(LocalDate.now(), Operation.DEPOSIT, BigDecimal.valueOf(50), BigDecimal.valueOf(2550));
		list.add(transaction);
		
		return list;
	}

	
}
