package Chapter5;
import java.util.Scanner;

public class FivePointSeventeen {
    public static void main(String[] args) {
        int total = 0;
        int gradeCounter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;

        Scanner input = new Scanner(System.in);

        for(int i = 1; i <= 5; i++){
            System.out.print("Enter Student Name: ");
            String name = input.nextLine();
            System.out.print("Enter Grade Letter: ");
            char grade = input.next().charAt(0);

        }

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();
        System.out.print("Enter Grade Letter: ");
        char grade = input.next().charAt(0);

        while (input.hasNext()){
            grade = input.next().charAt(0);
            total += grade;
            ++gradeCounter;

            switch(grade){
                case 'A':
                    ++aCount;
                    break;
                case'B':
                    ++bCount;
                    break;
                case'C':
                    ++cCount;
                    break;
                default:
                    ++dCount;
                    break;
            }
        }

    }
}
