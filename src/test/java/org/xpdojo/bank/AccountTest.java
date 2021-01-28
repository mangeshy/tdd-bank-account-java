package org.xpdojo.bank;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.xpdojo.bank.Account.defaultAccount;
import static org.xpdojo.bank.Account.newAccountWith;

public class AccountTest {
    @Test
    public void newAccountShouldHaveZeroBalance(){

        assertThat(defaultAccount().balance()==0);
    }

    @Test
    public void newAccountShouldAlwaysHaveBalance(){
        assertThat(newAccountWith(48).balance()==48);
    }
    @Test
    public void depositAnAmountToIncreaseTheDefaultAccountsBalance() {
        Account account = defaultAccount();
        account.deposit(98);
        assertThat(account.balance()==98);
    }
    @Test
    public void negativeAmountCantBeDeposited() {
        Account account = defaultAccount();
        account.deposit(-198);
        assertThat(account.balance()==0);
    }

}
