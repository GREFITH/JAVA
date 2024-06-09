import java.util.*;
class M
{
    //NANR
    void series()
    {
        int i;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value:");
        int n=s.nextInt();
        System.out.print("Enter the value:");
        int d=s.nextInt();
        if (n<d) {
            
            for(i=n+1;i<d;i++)
            {
                System.out.println(i);
            }
        }
        else
        {
            for(i=n-1;i>d;i--)
            {
                System.out.println(i);
            }
        }
    }
}
public class ex1 {
   public static void main(String[] args) {
       M f=new M();
       f.series();
   } 
}
