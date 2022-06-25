package com.list.autoboxing_unboxing;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("State Bank of India");

        bank.addBranch("Bangarpet");
        bank.addCustomer("Bangarpet", "Abhilash", 200000.0);
        bank.addCustomer("Bangarpet", "Janarrdhan", 1000000.0);
        bank.addCustomer("Bangarpet", "Uma", 500000.0);

        bank.addCustomerTransaction("Bangarpet", "Abhilash", 200000.0);
        bank.addCustomerTransaction("Bangarpet", "Janarrdhan", 1000000.0);
        bank.addCustomerTransaction("Bangarpet", "Uma", 500000.0);

        bank.addBranch("Kolar");
        bank.addCustomer("Kolar", "Likitha", 250000.0);
        bank.addCustomer("Kolar", "Killer", 100000.0);
        bank.addCustomer("Kolar", "Teju", 150000.0);

        bank.addCustomerTransaction("Kolar", "Likitha", 250000.0);
        bank.addCustomerTransaction("Kolar", "Killer", 100000.0);
        bank.addCustomerTransaction("Kolar", "Teju", 150000.0);

        bank.addBranch("Bangalore");
        bank.addCustomer("Bangalore", "Somu", 230000.0);
        bank.addCustomer("Bangalore", "Prashanthi", 120000.0);
        bank.addCustomer("Bangalore", "Pradeep", 140000.0);

        bank.addCustomerTransaction("Bangalore", "Somu", 230000.0);
        bank.addCustomerTransaction("Bangalore", "Prashanthi", 120000.0);
        bank.addCustomerTransaction("Bangalore", "Pradeep", 140000.0);

        bank.listCustomers("Bangarpet", true);

    }

}
