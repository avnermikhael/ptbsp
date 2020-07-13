import java.util.Scanner;

public class Logic8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("input:");
        int size = scan.nextInt();
        scan.close();

        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}