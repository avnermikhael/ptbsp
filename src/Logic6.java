import java.util.Scanner;

public class Logic6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input:");
        int input = scan.nextInt();
        scan.close();

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}