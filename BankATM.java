package Banking_Application;

public class BankATM extends ATM {

    @Override
    public void createAccount(String name, int accNo, double initialBalance) {
        accountHolderName = name;
        accountNumber = accNo;
        balance = initialBalance;
        transactions.add("Account created with balance: ₹" + balance);
        System.out.println("✅ Account Created Successfully!");
    }

    @Override
    public void generatePin(int newPin) {
        pin = newPin;
        System.out.println("🔐 PIN Generated Successfully!");
    }

    @Override
    public void checkBalance() {
        System.out.println("💰 Current Balance: ₹" + balance);
    }

    @Override
    public void withdraw(double amount, int enteredPin) {
        if (enteredPin != pin) {
            System.out.println("❌ Incorrect PIN!");
            return;
        }

        if (amount > balance) {
            System.out.println("❌ Insufficient Balance!");
        } else {
            balance -= amount;
            transactions.add("Withdrawn: ₹" + amount);
            System.out.println("✅ Please collect your cash.");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        transactions.add("Deposited: ₹" + amount);
        System.out.println("✅ Amount Deposited Successfully.");
    }

    @Override
    public void displayTransactions() {
        System.out.println("📜 Transaction History:");
        if (transactions.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (String t : transactions) {
                System.out.println("- " + t);
            }
        }
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("👤 Account Holder: " + accountHolderName);
        System.out.println("🏦 Account Number: " + accountNumber);
        System.out.println("💰 Balance: ₹" + balance);
    }
}
