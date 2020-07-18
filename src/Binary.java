import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int value;
        String input;

        System.out.println("8 digit binary:");
        input = scan.nextLine();
        scan.close();

        value = 0;
        // karakter ASCII berbentuk digit yang dikurangi 0 akan konversi ke nilai
        // integer sesuai digitnya
        value = value + (input.charAt(0) - '0') * 128; // 2^7 = 128
        value = value + (input.charAt(1) - '0') * 64; // 2^6 = 64
        value = value + (input.charAt(2) - '0') * 32; // 2^5 = 32
        value = value + (input.charAt(3) - '0') * 16; // 2^4 = 16
        value = value + (input.charAt(4) - '0') * 8; // 2^3 = 8
        value = value + (input.charAt(5) - '0') * 4; // 2^2 = 4
        value = value + (input.charAt(6) - '0') * 2; // 2^1 = 2
        value = value + (input.charAt(7) - '0') * 1; // 2^0 =1

        System.out.println(value);

    }
}