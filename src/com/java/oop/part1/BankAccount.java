package com.java.oop.part1;

public class BankAccount {

    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    public String deposit(double amount) {
        if (amount <= 0)
            return "Enter valid amount to deposit!!!";
        else {
            this.balance += amount;
            return "Total Balance: " + this.balance;
        }
    }

    public String withdraw(double  amount) {
        if (this.balance < amount)
            return "Insufficient balance, try again!!!";
        else
            return "Please collect the cash and updated balance is " + (this.balance - amount);
    }

}
