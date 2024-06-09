public class program1 {
    public static void main(String[] args) {
        int a[] = { 9, 6, 8, 7, 2, 1, 5, 3, 2, 0, 0, 1 };
        int l = a.length;
        int even[] = new int[l];
        int odd[] = new int[l];
        int c = 0, p = 0, q = 0, j, k;
        for (int i : a) {
            if (i == 0) {
                c++;
            } else if (i % 2 == 0) {
                even[p] = i;
                p++;

            } else {
                odd[q] = i;
                q++;
            }
        }
        System.out.println("zero:" + c);
        System.out.println("EVEN:");
        for (j = 0; j < p; j++) {
            System.out.println(even[j]);
        }
        System.out.println("ODD:");
        for (k = 0; k < q; k++) {
            System.out.println(odd[k]);
        }
    }
}
