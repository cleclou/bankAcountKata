package com.bank.account.kata.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import com.bank.account.kata.entity.Transactions;
import com.bank.account.kata.service.WithdrawalService;

public class WithdrawalServiceTest {
		
	WithdrawalService service = new WithdrawalService();
	BigDecimal balance;
	
	@Before
	public void setup() {
		balance = BigDecimal.valueOf(3000);
	}
	
	@Test
	public void withdraw_money_from_my_account() {
		
		BigDecimal amount = service.substractBigDecimal(BigDecimal.valueOf(260), balance);
		assertThat(amount, equalTo(BigDecimal.valueOf(2740)));		
		
	}
	
	@Test
	public void return_transactions_after_withdrawal_money() {
		
		Transactions transaction = new Transactions();
		
		transaction = service.getAmountAfterWithdrawalMoney(BigDecimal.valueOf(20));
		assertThat(transaction.getAmount(), equalTo(BigDecimal.valueOf(20)));
		assertThat(transaction.getBalance(), equalTo(BigDecimal.valueOf(3527.88)));
		
		
	}


}
