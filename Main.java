package Banking_Application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankATM atm = new BankATM();

        int choice;

        do {
            System.out.println("\n================ ATM MENU ================");
            System.out.println("1. Generate Pin");
            System.out.println("2. Check Balance");
            System.out.println("3. Withdraw Cash");
            System.out.println("4. Deposit Cash");
            System.out.println("5. Display Transaction History");
            System.out.println("6. Create Account");
            System.out.println("7. Display Account Details");
            System.out.println("8. Exit");
            System.out.print("Please select an option: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter new PIN: ");
                    atm.generatePin(sc.nextInt());
                    break;

                case 2:
                    atm.checkBalance();
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double wAmt = sc.nextDouble();
                    System.out.print("Enter PIN: ");
                    atm.withdraw(wAmt, sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter amount to deposit: ");
                    atm.deposit(sc.nextDouble());
                    break;

                case 5:
                    atm.displayTransactions();
                    break;

                case 6:
                    System.out.print("Enter Name: ");
                    sc.nextLine(); // clear buffer
                    String name = sc.nextLine();
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();
                    System.out.print("Enter Initial Balance: ");
                    double bal = sc.nextDouble();
                    atm.createAccount(name, accNo, bal);
                    break;

                case 7:
                    atm.displayAccountDetails();
                    break;

                case 8:
                    System.out.println("🙏 Thank you for using ATM!");
                    break;

                default:
                    System.out.println("❌ Invalid Option!");
            }

        } while (choice != 8);

        sc.close();
    }
}

