import entities.Bank;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank user;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String accountName = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)?: ");
        char resp = sc.next().charAt(0);
        if (resp == 'y'){
            System.out.print("Enter initial deposit value: ");
            double accountMoneyValue = sc.nextDouble();
            System.out.println();
            user = new Bank(accountNumber, accountName, accountMoneyValue);
        } else {
            user = new Bank(accountNumber, accountName);
        }
        System.out.println("Account data: ");
        System.out.println(user);

        System.out.print("Enter a deposit value: ");
        double accountMoneyInsert = sc.nextDouble();
        user.setDepositInBank(accountMoneyInsert);
        System.out.println("Update account data: ");
        System.out.println(user);
        System.out.print("Enter a withdraw value: ");
        double accountMoneyWithdraw = sc.nextDouble();
        user.setBankWithdrawal(accountMoneyWithdraw);
        System.out.println("Update account data: ");
        System.out.println(user);

        sc.close();
    }
}