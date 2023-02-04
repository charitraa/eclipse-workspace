package Day3;

import java.util.Scanner;

public class Exercise_1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read a number from the user
        System.out.print("Enter a number: ");
        double num = input.nextDouble();
        input.close();
        // Calculate the square, cube, and fourth power
        double square = num * num;
        double cube = num * num * num;
        double fourth = Math.pow(num, 4);

        // Display the results
        System.out.println("The square of the number is: " + square);
        System.out.println("The cube of the number is: " + cube);
        System.out.println("The fourth power of the number is: " + fourth);
    }

}
