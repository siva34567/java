package bank;

import java.util.Scanner;

public class Customer {
    String name;
    int accNo;
    int balance;

    public Customer(String name, int accNo) {
        this.name = name;
        this.accNo = accNo;
        this.balance = 0;
    }

    public void creditTransaction(int amount) {
        if (amount < 0) {
            System.out.println("Invalid credit amount. Please enter a positive value.");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            creditTransaction(amount);
        } else {
            balance += amount;
            System.out.println("Amount credited: " + amount);
        }
    }

    public void debitTransaction(int amount) {
        if (amount > balance) {
            System.out.println("Invalid debit amount. Insufficient balance.");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            debitTransaction(amount);
        } else {
            balance -= amount;
            System.out.println("Amount debited: " + amount);
        }
    }

    public void displayDetails() {
        System.out.println("Customer Details");
        System.out.println("****************");
        System.out.println("Customer Name: " + this.name);
        System.out.println("Customer AccNo: " + this.accNo);
        System.out.println("Customer Current Balance: " + this.balance);
    }
}
