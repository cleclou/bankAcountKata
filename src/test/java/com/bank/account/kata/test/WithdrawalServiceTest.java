package com.bank.account.kata.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import com.bank.account.kata.entity.Operation;
import com.bank.account.kata.entity.Transactions;
import com.bank.account.kata.service.WithdrawalService;

public class WithdrawalServiceTest {
		
	WithdrawalService service = new WithdrawalService();
	Transactions transaction;
	
	@Before
	public void setup() {
		transaction = new Transactions();
		transaction.setBalance(BigDecimal.valueOf(3000));
	}
	
	@Test
	public void withdraw_money_from_my_account() {
		
		BigDecimal amount = service.substractBigDecimal(BigDecimal.valueOf(260), transaction.getBalance());
		assertThat(amount, equalTo(BigDecimal.valueOf(2740)));		
		
	}
	
	@Test
	public void return_transactions_after_withdrawal_money() {
		
		Transactions transaction = new Transactions();
		
		transaction = service.getAmountAfterWithdrawalMoney(BigDecimal.valueOf(20));
		assertThat(transaction.getAmount(), equalTo(BigDecimal.valueOf(20)));
		assertThat(transaction.getBalance(), equalTo(BigDecimal.valueOf(3527.88)));
		assertThat(transaction.getOperation(), equalTo(Operation.WITHDRAWAL));
		assertThat(transaction.getDate(), equalTo(LocalDate.now()));
		
		
	}


}
