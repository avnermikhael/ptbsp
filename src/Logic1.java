import java.util.Scanner;

public class Logic1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input:");
        int input = scan.nextInt();
        scan.close();

        int i;
        int j;

        for (i = 0; i < input; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
