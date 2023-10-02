import java.util.InputMismatchException;
import java.util.Scanner;

class NumCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            double num1 = input.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = input.nextDouble();

            if (num1 == num2) {
                System.out.println("Both numbers are equal.");
            } else if (num1 < num2) {
                System.out.println("The first number is less than the second number.");
            } else {
                System.out.println("The second number is less than the first number.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter valid numbers.");
        } finally {
            input.close();
        }
    }
}
