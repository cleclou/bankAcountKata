package com.bank.account.kata.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.bank.account.kata.entity.Operation;
import com.bank.account.kata.entity.Transactions;


public class HistoryServiceTest {
	
	Transactions transactions;
	List<Transactions> list = new ArrayList<>();
	
	@Before
	public void setup() {
		transactions = new Transactions(LocalDate.now(), Operation.WITHDRAWAL,
				BigDecimal.valueOf(400), BigDecimal.valueOf(2500));
		list.add(transactions);
		transactions = new Transactions(LocalDate.now(), Operation.DEPOSIT, BigDecimal.valueOf(50), BigDecimal.valueOf(2550));
		list.add(transactions);
	}
	
	@Test
	public void return_list_transactions() {
		int sizeMax = list.size();
		assertThat(sizeMax, equalTo(2));
		assertThat(list.get(sizeMax-1).getBalance(), equalTo(BigDecimal.valueOf(2550)));
	}
}