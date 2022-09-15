package Chapter4;

import java.util.Scanner;

public class Gallons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int miles = 0;
        int gallon = 0;
        Double totalMPG;


        System.out.println("Enter miles driven or -1 to quit: ");
        miles = input.nextInt();

        if(miles != -1){
            System.out.println("Enter gallon used:  ");
            gallon = input.nextInt();
        }

        while(miles != -1){
            int totalMiles = miles;
            int totalGallon = gallon;
            totalMPG = (double) totalMiles / totalGallon;
            int milesPerGallon = miles / gallon;

            System.out.printf("Total miles per gallon is %.2f\n", totalMPG);
            System.out.printf("The miles per gallon is %.2f%n", milesPerGallon);
        }

    }
}
