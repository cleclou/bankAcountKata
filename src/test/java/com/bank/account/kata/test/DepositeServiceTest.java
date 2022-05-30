package com.bank.account.kata.test;

import java.math.BigDecimal;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class DepositeServiceTest {
	
	@Test
	public void deposit_money_without_decimal_to_my_account() {
		BigDecimal deposit = new BigDecimal(400);
		BigDecimal myAccount = add(deposit);

		assertThat(myAccount, equalTo(BigDecimal.valueOf(2500)));
		
	}
	
	private BigDecimal add(BigDecimal deposit) {
		BigDecimal myAccount = new BigDecimal(2100);
		return myAccount.add(deposit);
	}

}
