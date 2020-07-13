import java.util.Scanner;

public class Logic5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input:");
        int input = scan.nextInt();
        scan.close();

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                if (j % 2 == 0) {
                    System.out.print("#");
                } else {
                    System.out.print("O");
                }
            }
            System.out.println();
        }
    }
}