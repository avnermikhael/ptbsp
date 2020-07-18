public class Spiral {
    public static void main(String[] args) {
        int size = 5;
        int matrix[][] = new int[5][5];
        int x = 0; // position x
        int y = 0; // position y
        int d = 0; // direction; 0=RIGHT, 1=DOWN, 2=LEFT, 3=UP
        int c = 1; // counter
        int s = 1; // chain size

        int kx;

        // starting point
        x = (size / 2);
        y = (size / 2);

        for (int k = 1; k <= (size - 1); k++) {
            if (k < (size - 1)) {
                kx = 2;
            } else {
                kx = 3;
            }
            for (int j = 0; j < kx; j++) {
                for (int i = 0; i < s; i++) {
                    matrix[x][y] = c;
                    c++;

                    switch (d) {
                        case 0:
                            y = y + 1;
                            break;
                        case 1:
                            x = x + 1;
                            break;
                        case 2:
                            y = y - 1;
                            break;
                        case 3:
                            x = x - 1;
                            break;
                    }
                }
                d = (d + 1) % 4;
            }
            s = s + 1;
        }

        for (int p = 0; p < 5; p++) {
            for (int q = 0; q < 5; q++) {
                System.out.print(matrix[p][q] + "  ");
            }
            System.out.println();
        }
    }
}