import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input;
        String number;

        System.out.println("8 digit binary:");
        number = scan.nextLine();
        scan.close();

        input = 0;
        // karakter ASCII berbentuk digit yang dikurangi 0 akan konversi ke nilai
        // integer sesuai digitnya
        input = input + (number.charAt(0) - '0') * 128; // 2^7 = 128
        input = input + (number.charAt(1) - '0') * 64; // 2^6 = 64
        input = input + (number.charAt(2) - '0') * 32; // 2^5 = 32
        input = input + (number.charAt(3) - '0') * 16; // 2^4 = 16
        input = input + (number.charAt(4) - '0') * 8; // 2^3 = 8
        input = input + (number.charAt(5) - '0') * 4; // 2^2 = 4
        input = input + (number.charAt(6) - '0') * 2; // 2^1 = 2
        input = input + (number.charAt(7) - '0') * 1; // 2^0 =1

        System.out.println(input);

    }
}