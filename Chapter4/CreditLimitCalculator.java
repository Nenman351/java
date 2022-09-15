package Chapter4;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int accountNumber;
        int beginningBalance;
        int charges;
        int credits;
        int creditLimit;

        System.out.println("Enter the balance at the beginning of the month: ");
        beginningBalance = input.nextInt();
        System.out.println("Enter total of all items charged by the customer this month: ");
        charges = input.nextInt();
        System.out.println("Enter total of all credits applied to the customer's account this month: ");
        credits = input.nextInt();


        int newBalance = beginningBalance + charges - credits;

        System.out.printf("The new balance is %d%n", newBalance);

        if (newBalance > 200_000){
            System.out.println("Credit limit is ok.");

        }
        else {
            System.out.println("Credit limit exceeded");
        }



    }
}
