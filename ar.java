import java.util.*;

public class ar {
    public static void main(String[] args) {
        int i, j,w,f;
        int arr[] = new int[100];
        Scanner s = new Scanner(System.in);

        for (i = 0; i < 100; i++) {
            System.out.println("Enter the value:");
            int r = s.nextInt();
            arr[i] = r;
            System.out.println("do you want to repeat:");
            w =s.nextInt();
            arr[i]=w;
            if (w == 4) {
                break;
            }
        }
        do
        {
            for(j=i;j<100;j++)
            {
                System.out.println("Enter the value:");
                f=s.nextInt();
                arr[i] = f;
                System.out.println("do you want to repeat:");
                w =s.nextInt();
                arr[i]=w;
                if (w == 4) {
                    break;
                }
            }
        }while(i==60);
    }
}
