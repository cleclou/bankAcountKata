package com.bank.account.kata.test;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import com.bank.account.kata.entity.Transactions;
import com.bank.account.kata.service.DepositService;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class DepositeServiceTest {

	BigDecimal balance;
	
	@Before
	public void setUp() {
		balance = BigDecimal.valueOf(2100);
	}
	
	DepositService service = new DepositService();
	
	@Test
	public void deposit_money_without_decimal_to_my_account() {
		BigDecimal deposit = new BigDecimal(400);
		BigDecimal myAccount = service.add(deposit, balance);

		assertThat(myAccount, equalTo(BigDecimal.valueOf(2500)));
		
	}
	
	@Test
	public void deposit_money_with_decimal_to_my_account() {
		BigDecimal deposit = BigDecimal.valueOf(400.87);
		BigDecimal myAccount = service.add(deposit,balance);

		assertThat(myAccount, equalTo(BigDecimal.valueOf(2500.87)));
	}
	
	@Test
	public void return_transactions_after_deposit_money() {
		
		Transactions transaction = new Transactions();
		
		transaction = service.getAmountAfterDepositMoney(BigDecimal.valueOf(2548.25));
		assertThat(transaction.getAmount(), equalTo(BigDecimal.valueOf(2548.25)));
		assertThat(transaction.getBalance(), equalTo(BigDecimal.valueOf(3548.25)));
		
		
	}

}
