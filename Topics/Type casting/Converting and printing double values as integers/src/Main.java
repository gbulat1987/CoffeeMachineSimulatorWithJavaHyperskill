import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number as a double.
        double inputValue = scanner.nextDouble();

        // Convert and print the number to an integer.

       int intValue = (int) inputValue;
        System.out.println(intValue);

        scanner.close();
    }
}