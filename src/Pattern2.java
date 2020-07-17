import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input:");
        int input = scan.nextInt();
        scan.close();

        int start = 1;

        for (int i = 1; i <= input; i++) {
            int temp = start;
            for (int j = 1; j <= input; j++) {
                System.out.print(temp + " ");
                temp = temp + 1;
            }
            System.out.println();
            start = start + input;
        }
    }
}