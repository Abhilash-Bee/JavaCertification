package com.list.autoboxing_unboxing;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        if(findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for(int i=0; i<branches.size(); i++) {
            Branch checkBranch = branches.get(i);
            if(checkBranch.getName().equals(branchName))
                return checkBranch;
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer> branchCustomer = branch.getCustomers();
            for (int i=0; i<branchCustomer.size(); i++) {
                Customer branchCustomerName = branchCustomer.get(i);
                System.out.println((i+1) + ". " + branchCustomerName.getName());
                if (showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomerName.getTransactions();
                    for (int j=0; j<transactions.size(); j++) {
                        System.out.println((j+1) + ". " + transactions.get(j));
                    }
                    System.out.println();
                }
            }
            return true;
        }
        return false;
    }

}
