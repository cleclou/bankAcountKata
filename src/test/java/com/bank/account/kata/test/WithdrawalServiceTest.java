package com.bank.account.kata.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.math.BigDecimal;

import org.junit.Test;

public class WithdrawalServiceTest {
		
		@Test
		public void withdraw_money_from_my_account() {
			
			BigDecimal amount = substractBigDecimal(BigDecimal.valueOf(260));
			assertThat(amount, equalTo(BigDecimal.valueOf(2740)));		
			
		}

		private BigDecimal substractBigDecimal(BigDecimal withdrawal) {
			BigDecimal balance = BigDecimal.valueOf(3000);
			return balance.subtract(withdrawal);
		}


}
