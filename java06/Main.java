import java.util.Scanner;
import bank.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Customer Name");
        String name = input.next();
        System.out.println("Enter account number");
        int acc_no = input.nextInt();
        Customer aCustomer = new Customer(name,acc_no);
        int choice = 0;

        while (choice != 4) {
            System.out.println("\n1. Add Money\n2. Get Money\n3. Details\n4. Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to credit: ");
                    int creditAmount = input.nextInt();
                    aCustomer.creditTransaction(creditAmount);
                    break;
                case 2:
                    System.out.print("Enter the amount to debit: ");
                    int debitAmount = input.nextInt();
                    aCustomer.debitTransaction(debitAmount);
                    break;
                case 3:
                    aCustomer.displayDetails();
                    break;
                case 4:
                    System.out.println("Thank You !!!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        input.close();
    }
}
