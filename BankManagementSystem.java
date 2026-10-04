import java.util.Scanner;

class BankAccount {

    int accountNumber;
    String name;
    double balance;

    BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    void displayAccount() {
        System.out.println("\n----- Account Details -----");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + name);
        System.out.println("Balance        : ₹" + balance);
    }
}

public class BankManagementSystem {

    static Scanner sc = new Scanner(System.in);

    // Array to store bank accounts
    static BankAccount[] accounts = new BankAccount[100];

    static int count = 0;

    // Create account
    static void createAccount() {

        if (count >= accounts.length) {
            System.out.println("Bank account limit reached.");
            return;
        }

        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Deposit: ");
        double balance = sc.nextDouble();

        accounts[count] = new BankAccount(accountNumber, name, balance);
        count++;

        System.out.println("Account created successfully.");
    }

    // Find account
    static BankAccount findAccount(int accountNumber) {

        for (int i = 0; i < count; i++) {

            if (accounts[i].accountNumber == accountNumber) {
                return accounts[i];
            }
        }

        return null;
    }

    // Deposit
    static void depositMoney() {

        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();

        BankAccount account = findAccount(accountNumber);

        if (account != null) {

            System.out.print("Enter Amount to Deposit: ");
            double amount = sc.nextDouble();

            account.deposit(amount);

        } else {
            System.out.println("Account not found.");
        }
    }

    // Withdraw
    static void withdrawMoney() {

        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();

        BankAccount account = findAccount(accountNumber);

        if (account != null) {

            System.out.print("Enter Amount to Withdraw: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);

        } else {
            System.out.println("Account not found.");
        }
    }

    // Check balance
    static void checkBalance() {

        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();

        BankAccount account = findAccount(accountNumber);

        if (account != null) {

            System.out.println("Account Holder: " + account.name);
            System.out.println("Balance: ₹" + account.balance);

        } else {
            System.out.println("Account not found.");
        }
    }

    // Display all accounts
    static void displayAllAccounts() {

        if (count == 0) {
            System.out.println("No accounts available.");
            return;
        }

        System.out.println("\n===== All Bank Accounts =====");

        for (int i = 0; i < count; i++) {

            System.out.println("\nAccount Number: " + accounts[i].accountNumber);
            System.out.println("Name: " + accounts[i].name);
            System.out.println("Balance: ₹" + accounts[i].balance);
        }
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n==============================");
            System.out.println("     BANK MANAGEMENT SYSTEM");
            System.out.println("==============================");

            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    createAccount();
                    break;

                case 2:
                    depositMoney();
                    break;

                case 3:
                    withdrawMoney();
                    break;

                case 4:
                    checkBalance();
                    break;

                case 5:
                    displayAllAccounts();
                    break;

                case 6:
                    System.out.println("Thank you for using Bank Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}