import java.util.*;
class M
{
    //NANR
    void fact()
    {
        int n,fact=1,d,i;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value:");
        n=s.nextInt();
        System.out.println("Enter the value:");
        d=s.nextInt();
        // if (n<d) {
            
            for(i=n;i<=d;i++)
            {
                fact*=i;
                System.out.println("Factorial value of: "+i+" is "+fact);
            }
        }
        // else
        // {
        //     for(i=n;i>=d;i--)
        //     {
        //         fact*=i;
        //         System.out.println("Factorial value of: "+i+" is "+fact);
        //     }
        // }
        // System.out.println();
    }

public class factorial {
    public static void main(String[] args) {
        M f=new M();
        f.fact();
    }
}
