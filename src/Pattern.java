import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input");
        int input = scanner.nextInt();
        scanner.close();
        System.out.println("Pattern Printing");

        int start = input * input;

        for (int i = 1; i <= input; i++) {
            int temp = start;
            for (int j = 1; j <= input; j++) {
                System.out.print(temp + " ");
                temp = temp - input;
            }
            System.out.println();
            start = start - 1;
        }
    }
}