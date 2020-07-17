
public class Next {
    public static void main(String[] args) {
        int k = 0;
        int i = 0;
        char[] a = { 'A', 'D', 'A', ' ', 'K', 'A', ' ', 'D', 'A', 'B', 'R', 'A' };
        char[] b = { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };
        int[] y = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        while (i < 13) {
            int j = 1;
            boolean s = true;
            while ((j <= k) && (s)) {
                if (a[i] == b[j]) {
                    y[j] = y[j] + 1;
                    s = false;
                }
                j = j + 1;
            }
            ;
            if (s) {
                k = k + 1;
                b[k] = a[i];
                y[k] = 1;
            }
            i = i + 1;
        }
        ;

        for (int x = 0; x < a.length; x++) {
            System.out.print(a[x] + " ");
        }
        System.out.println();
        for (int w = 0; w < b.length; w++) {
            System.out.print(b[w] + " ");
        }
        System.out.println();
        for (int v = 0; v < y.length; v++) {
            System.out.print(y[v] + " ");
        }
        System.out.println();
        for (int p = 0; p < a.length; p++) {
            System.out.print(a[p] + " ");
        }
    }
}