import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int code = scanner.nextInt();

        String color = "";

        // Use a switch statement here to determine the color of the traffic signal
        switch (code) {
            case 1:
                color = "Green";
                break;
            case 2:
                color = "Yellow";
                break;
            case 3:
                color = "Red";
                break;
            default:
                color = "Invalid";
                break;
        }
        System.out.println(color);
    }
}
           
