package wk2;

public class BankAccount {

    /*

    Attributes
    account type: Checking or Savings
    tracks number of deposits and withdrawals
    balance amount that cannot be low zero dollars
    */
    private String accountType;
    private int numDeposits, numWithdrawals;

/*
Actions
    constructor: set account type and balance
    withdraw(double amount) => balance cannot go below zero dollars. Increase number of withdrawals tracker
    deposit(double amount) => increase number of deposits tracker
    getBalance => return balance
    getNumberDeposits
    getNumberofWithdrawals

     */
    public BankAccount(){}
    public BankAccount(String accountType, double balance){
        //call on methods to evaluate accountType and balance
    }

}
