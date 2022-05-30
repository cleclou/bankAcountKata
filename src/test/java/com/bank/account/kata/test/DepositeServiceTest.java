package com.bank.account.kata.test;

import java.math.BigDecimal;

import org.junit.Test;

import com.bank.account.kata.service.DepositService;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class DepositeServiceTest {

	DepositService service = new DepositService();

	@Test
	public void deposit_money_without_decimal_to_my_account() {
		BigDecimal deposit = new BigDecimal(400);
		BigDecimal myAccount = service.add(deposit);

		assertThat(myAccount, equalTo(BigDecimal.valueOf(2500)));

	}

	@Test
	public void deposit_money_with_decimal_to_my_account() {
		BigDecimal deposit = BigDecimal.valueOf(400.87);
		BigDecimal myAccount = service.add(deposit);

		assertThat(myAccount, equalTo(BigDecimal.valueOf(2500.87)));
	}

}
