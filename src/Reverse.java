import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("input:");

        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = "";
        read.close();

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println(reverse);
    }
}