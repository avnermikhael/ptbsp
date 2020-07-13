import java.util.Scanner;

public class Logic2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("input:");
        int size = scan.nextInt();
        scan.close();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int j = 0; j < size; j++) {
            for (int k = size - 1; k > j; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}