import java.util.Scanner;

public class SquareRootCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            double num = Double.parseDouble(scanner.nextLine());

            if (num < 0) {
                throw new IllegalArgumentException("Cannot calculate the square root of a negative number.");
            }

            double result = Math.sqrt(num);
            System.out.println("Square root: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a numeric value.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
