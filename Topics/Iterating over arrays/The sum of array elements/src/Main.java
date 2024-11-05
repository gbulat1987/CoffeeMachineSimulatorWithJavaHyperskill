import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }


        int sum = calculateSum(array);

        System.out.println(sum);

    }

    private static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        return sum;
    }
}