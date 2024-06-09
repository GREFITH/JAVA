import java.util.*;

public class Exceptionrollno {
    public static void main(String[] args) {
        int l, i, j;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length:");
        l = s.nextInt();
        int a[] = new int[l];

        for (i = 0; i < l; i++) {
            System.out.println("Enter the roll no " + (i + 1) + ":");
            a[i] = s.nextInt();

            try {
                if (a[i] > l) {
                    i--;
                    throw new ArrayIndexOutOfBoundsException("Enter the valid value");
                } else {
                    for (j = 0; j < i; j++)
                    {

                    
                        if (a[i] == a[j]) {
                            i--;
                            throw new Exception("Already exist");
                        }
                    }
                }
            }

            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        for(int k=0;k<l;k++)
        {
            System.out.println("Roll no"+(k+1)+":"+a[k]);
            
        }
    }
}