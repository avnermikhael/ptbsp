// import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        // int input = 4;

        // for (int i = 1; i <= input; i++) {
        // int j = (i * 2) - 1;

        // for (int k = 1; k <= input; k++) {
        // System.out.print(j + " ");
        // j += 2;
        // if (j > (input * 2) - 1)
        // j = 1;
        // }
        // System.out.println();
        // }

        // int input = 4;
        // int num = 1;

        // for (int i = 1; i <= input; i++) {
        // for (int j = 1; j <= input; j++) {
        // if (j == 1) {
        // num = num + 1;
        // System.out.print(num + " ");
        // } else if (j == input) {
        // num = num - (input - 1);
        // System.out.print(num + " ");
        // num++;
        // } else {
        // num = num + 1;
        // System.out.print(num + " ");
        // }
        // }
        // System.out.println();
        // num = num + (input - 1);
        // }

        // int a = 1;
        // for (int i = 0; i <= 5; i++) {
        // System.out.println(a);
        // System.out.println(a++);
        // System.out.println(++a);
        // }

        // int a = 7;
        // int b = 5;
        // a = ++b;
        // b = a++;
        // System.out.println(a);
        // System.out.println(b);

        // int x = 0;
        // int i = 0;

        // while (i < 10) {
        // x = i % 7;
        // i = i + 1;
        // }
        // System.out.println(x);
        // int a = 1;
        // int x = 3 - ++a;
        // System.out.println(x);

        // int baris = 5;
        // int kolom = 5;

        // for (int i = 0; i < baris; i++) {
        // for (int j = 0; j < kolom; j++) {
        // if (i == 0 || i == baris - 1 || j == 0 || j == kolom - 1)
        // System.out.print("1");
        // else
        // System.out.print("0");
        // }
        // System.out.println();
        // }

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter N : ");
        // int n = sc.nextInt();
        // sc.close();

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // if (j == i || j == n - i + 1) {
        // System.out.print("1");
        // } else {
        // System.out.print("0");
        // }
        // }
        // System.out.println();
        // }

        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int n = input.nextInt();
        // input.close();
        // for (int row = 0; row < n; row++) {
        // for (int column = 0; column < n; column++) {
        // if (row == 0 || row == n - 1 || column == n - 1 - row) {
        // System.out.print("1");
        // } else {
        // System.out.print("0");
        // }
        // }
        // System.out.println();
        // }

        // int input;
        // // int number = 1;
        // Scanner scan = new Scanner(System.in);

        // System.out.print("Enter Number of Rows : ");
        // input = scan.nextInt();
        // scan.close();

        // for (int i = 0; i < input; i++) {
        // for (int k = input; k > i; k--) {
        // System.out.print(" ");
        // }
        // number = 1;
        // for (int j = 0; j <= i; j++) {
        // System.out.print(number + " ");
        // number = number * (i - j) / (j + 1);
        // }
        // System.out.println();
        // }

        // // Create a new Scanner object
        // Scanner scanner = new Scanner(System.in);
        // // Get the number of rows from the user
        // System.out.println("Enter the number of rows to print the pattern ");
        // int input = scanner.nextInt();
        // System.out.println("** Printing the pattern... **");
        // scanner.close();

        // // setengah atas
        // for (int i = 0; i <= input; i++) {
        // // for (int j = 1; j <= i; j++) {
        // // System.out.print(j + " ");
        // // }
        // for (int k = i - 1; k >= 0; k--) {
        // System.out.print(k + " ");
        // }
        // System.out.println();
        // }

        // // setengah bawahnya
        // for (int i = input - 1; i >= 0; i--) {
        // // for (int j = 1; j <= i; j++) {
        // // System.out.print(j + " ");
        // // }
        // for (int k = i - 1; k >= 0; k--) {
        // System.out.print(k + " ");
        // }
        // System.out.println();
        // }

        // // Create a new Scanner object
        // Scanner scanner = new Scanner(System.in);

        // // Get the number of rows from the user
        // System.out.println("Enter the number of rows to print the pattern ");

        // int rows = scanner.nextInt();

        // System.out.println("** Printing the pattern... **");

        // scanner.close();

        // for (int i = 1; i <= rows; i++) {
        // for (int j = rows; j > i; j--) {
        // System.out.print(" ");
        // }
        // for (int k = 1; k <= i; k++) {
        // System.out.print("*");
        // }
        // for (int l = i - 1; l >= 1; l--) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // // Create a new Scanner object
        // Scanner scanner = new Scanner(System.in);

        // // Get the number of rows from the user
        // System.out.println("Enter the number of rows to print the pattern ");

        // int rows = scanner.nextInt();

        // System.out.println("** Printing the pattern... **");
        // scanner.close();

        // for (int i = 1; i <= rows; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // for (int i = rows; i >= 1; i--) {
        // for (int j = 1; j < i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // int count = 0;
        // // int max_count = 10;
        // int i;
        // // System.out.println("First " + max_count + " Prime Numbers:");

        // for (int num = 1; count < input; num++) {
        // for (i = 2; num % i != 0; i++) {
        // if (i == num) {
        // System.out.print(num + ", ");
        // count++;
        // }
        // }
        // }

        // Scanner sc = new Scanner(System.in);
        // int n, c;
        // System.out.println("Enter the number till which you want prime numbers");
        // n = sc.nextInt();
        // System.out.println("Prime numbers are :-");
        // sc.close();

        // for (int i = 2; i <= n; i++) {
        // c = 0;
        // for (int j = 1; j <= i; j++) {
        // if (i % j == 0) {
        // c++;
        // }
        // }
        // if (c == 2) {
        // System.out.print(i + " ");
        // }
        // }

        // String a, b = "";
        // Scanner s = new Scanner(System.in);
        // System.out.print("Enter the string you want to check:");
        // a = s.nextLine();
        // int n = a.length();
        // s.close();

        // for (int i = n - 1; i >= 0; i--) {
        // b = b + a.charAt(i);
        // }
        // if (a.equalsIgnoreCase(b)) {
        // System.out.println("TRUE");
        // } else {
        // System.out.println("FALSE");
        // }

        // int num = 29;
        // boolean flag = false;
        // for (int i = 2; i <= num / 2; ++i) {
        // // condition for nonprime number
        // if (num % i == 0) {
        // flag = true;
        // break;
        // }
        // }

        // if (!flag)
        // System.out.println(num + " is a prime number.");
        // else
        // System.out.println(num + " is not a prime number.");

    }
}