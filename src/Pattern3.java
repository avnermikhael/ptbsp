// import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        int input = 4;
        int n = 1;
        int array[][] = new int[100][100];

        for (int k = 0; k < input; k++) {
            System.out.println();
            for (int l = 0; l < input; l++) {
                array[k][l] = n++;
            }
        }

        for (int i = 0; i < input; i++) {

            for (int j = 0; j < input; j++) {
                if (array[i] == array[j]) {
                    System.out.print("0 ");
                } else {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}