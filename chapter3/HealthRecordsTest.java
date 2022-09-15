package chapter3;

import java.util.Scanner;

public class HealthRecordsTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HealthRecords hr = new HealthRecords("Nenman", "Jonathan","Female", 2000, 12,
                12, 56.3, 50.3 );


        System.out.printf("Firstname is %s%n",hr.getFirstName());
        System.out.printf("LastName is %s%n", hr.getLastName());
        System.out.printf("Gender is %s%n", hr.getGender());
        System.out.printf("Date of Birth is %s%n", hr.getDateOfBirth());
        System.out.printf("Age is %d%n", hr.getAge());
        System.out.printf("Height is %d%n", hr.getHeightInInches());
        System.out.printf("Weight is %d%n", hr.getWeightInPounds());
        System.out.printf("The BMI is %d%n", hr.getBodyMassIndex());
        System.out.printf("The Target Heart rate is %d%n", hr.getTargetHeartRate1());
        System.out.printf("The Target Heart rate is %d%n", hr.getTargetHeartRate2());
        System.out.printf("The maximum Heart rate is %d%n", hr.getMaximumHeartRate());


        System.out.println("\nBMI Values");
        System.out.println("Underweight = <18.5");
        System.out.println("Normal weight = 18.5–24.9");
        System.out.println("Overweight = 25–29.9");
        System.out.println("Obesity = BMI of 30 or greater");
        System.out.println();



        System.out.println("Enter First Name: ");
        input.nextLine();
        hr.getFirstName();

        System.out.println("Enter Last Name:");
        input.nextLine();
        hr.getLastName();

        System.out.println("Enter gender: ");
        input.nextLine();
        hr.getGender();

        System.out.println("Enter year of birth: ");
        input.nextInt();
        hr.getYear();

        System.out.println("Enter month of birth: ");
        input.nextInt();
        hr.getMonth();

        System.out.println("Enter day of birth: ");
        input.nextInt();
        hr.getDay();

        System.out.println("Enter height in inches: ");
        input.nextDouble();
        hr.getHeightInInches();

        System.out.println("Enter weight in pounds: ");
        input.nextDouble();
        hr.getWeightInPounds();



    }

}
