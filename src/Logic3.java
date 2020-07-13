import java.util.Scanner;

public class Logic3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("input:");
        int size = scan.nextInt();
        scan.close();

        for (int j = 0; j < size; j++) {
            for (int k = size; k > j; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}