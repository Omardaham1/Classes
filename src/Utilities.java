package com.bank.util;

import java.util.Collections;
import java.util.List;

public class Utilities {
    public static List<Account> sortAccounts(List<Account> accounts) {
        Collections.sort(accounts, (a, b) -> Double.compare(a.calculateInterest(), b.calculateInterest()));
        return accounts;
    }

    public static List<Customer> sortCustomers(List<Customer> customers) {
        Collections.sort(customers, (a, b) -> a.getName().compareTo(b.getName()));
        return customers;
    }
}