public class primetest1 {

    public static void main(String[] args) {
        int j, k, i, r, flag = 0;
        for (j = 1; j <= 100; j++) {
            int n = j;
            if (n == 0 || n == 1) {
                continue;
            }
            for (k = 2; k <= n / 2; k++) {
                if (j % k == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                for (r = 1; r <= 10; r++) {
                    System.out.println(j + " * " + r + " = " + (j * r));
                }
                System.out.println();
            }
            flag = 0;
        }
    }
}