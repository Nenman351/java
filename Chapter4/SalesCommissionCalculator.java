package Chapter4;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of items sold or -1 to quit: ");
        int item = input.nextInt();

        if(item != -1){
            System.out.println("");
        }
    }
}
