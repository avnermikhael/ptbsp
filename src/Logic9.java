import java.util.Scanner;

public class Logic9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input:");
        int input = scan.nextInt();
        scan.close();

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                System.out.print(input);
            }
            System.out.println();
        }
    }
}