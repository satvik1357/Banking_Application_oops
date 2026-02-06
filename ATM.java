package Banking_Application;

import java.util.ArrayList;

public abstract class ATM {
    protected String accountHolderName;
    protected int accountNumber;
    protected int pin;
    protected double balance;
    protected ArrayList<String> transactions;

    ATM() {
        transactions = new ArrayList<>();
    }

    public abstract void createAccount(String name, int accNo, double initialBalance);
    public abstract void generatePin(int newPin);
    public abstract void checkBalance();
    public abstract void withdraw(double amount, int enteredPin);
    public abstract void deposit(double amount);
    public abstract void displayTransactions();
    public abstract void displayAccountDetails();
}

