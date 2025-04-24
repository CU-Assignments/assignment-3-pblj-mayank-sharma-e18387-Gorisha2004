import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        final int correctPIN = 1234;
        double balance = 3000;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter PIN: ");
            int enteredPIN = scanner.nextInt();

            if (enteredPIN != correctPIN) {
                throw new SecurityException("Invalid PIN.");
            }

            System.out.print("Withdraw Amount: ");
            double amount = scanner.nextDouble();

            if (amount > balance) {
                throw new ArithmeticException("Insufficient balance.");
            }

            balance -= amount;
            System.out.println("Withdrawal successful. New Balance: " + balance);

        } catch (SecurityException | ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Current Balance: " + balance);
        }
    }
}
