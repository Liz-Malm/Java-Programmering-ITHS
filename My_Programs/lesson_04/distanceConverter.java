package my_programs.lesson_04;

import java.util.Scanner;

public class distanceConverter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String menu = """

        Would you like to convert from miles > kilometers or kilometers > miles?
        
        1. miles > kilometers
        2. kilometers > miles
        """;
        System.out.println(menu);

        int option = s.nextInt();

         switch (option) {
            case 1: // miles > kilometers
                option = 1;
                convert(option);
                break;
            case 2: // kilometers > miles
                option = 2;
                convert(option);
                break;
            default:
                System.out.println("Invalid input!");
                break;
         }
    }

    public static double convert(int op){
        Scanner s1 = new Scanner(System.in);
        double in, sum;
        double translator = 1.609344; 

        if (op == 1) {
            System.out.println("\nInput miles:");
            in = s1.nextInt();
            sum = in * translator;
            System.out.println("\n" + in + " miles is " + sum + " in kilometers!");
        } else if (op == 2) {
            System.out.println("\nInput kilometers: ");
            in = s1.nextInt();
            sum = in / translator;
            System.out.println("\n" + in + " kilometers is " + sum + " in miles!");
        }
        System.out.println("");
        return op;
    }
}
