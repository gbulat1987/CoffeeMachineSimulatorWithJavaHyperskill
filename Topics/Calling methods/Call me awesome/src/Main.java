import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        callMeAwesome ();
    }

    // Do not change code below
    public static void callMeAwesome() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println(name + ", you're awesome!");
    }
}