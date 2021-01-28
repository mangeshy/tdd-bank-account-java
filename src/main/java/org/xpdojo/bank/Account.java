package org.xpdojo.bank;

public class Account {
    private Integer balance;

    public Account(Integer balance) {
        this.balance = balance;
    }
    public static Account defaultAccount(){
        return  new Account(0);
    }
    public static Account newAccountWith(int amount){
        return new Account(amount);
    }
    public Integer balance() {
        return balance;
    }

    public void deposit(int amount) {
        if(amount<=0)
            return;
        this.balance += amount;
    }

}

