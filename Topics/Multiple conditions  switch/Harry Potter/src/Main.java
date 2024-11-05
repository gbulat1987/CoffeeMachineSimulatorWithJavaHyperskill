import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String house = scanner.nextLine().trim().toLowerCase();
        if (house.equals("gryffindor")) {
            System.out.println("bravery");
        } else if (house.equals("hufflepuff")) {
            System.out.println("loyalty");

            
        }else if (house.equals("slytherin")) {
            System.out.println("cunning");
        } else if (house.equals("ravenclaw")) {
            System.out.println("intellect");
        } else {
            System.out.println("not a valid house");
        }
    }
}