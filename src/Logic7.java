import java.util.Scanner;

public class Logic7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("input:");
        int size = scan.nextInt();
        scan.close();

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(i - 1);
            }
            System.out.println();
        }
    }
}