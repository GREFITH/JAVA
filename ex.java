import java.util.*;
class M
{
    //NANR
    int i=0;
    void find()
    {
         int j=0,n,d;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value:");
        n=s.nextInt();
        System.out.print("Enter the value:");
         d=s.nextInt();
        if (n<d) {
            
            for(i=n;i<=d;i++)
            {
                System.out.println(i);
                j++;
            }
            System.out.println("NUMBERS in SERIES:"+j);
        }
        else
        {
            for(i=n;i>d;i--)
            {
                System.out.println(i);
                j++;
            }
            System.out.println("NUMBER in SERIES:"+j);
        }
    }
    //NAWR
    int sum()
    {
       int j=0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value:");
        int n=s.nextInt();
        System.out.print("Enter the value:");
        int d=s.nextInt();
        for(i=n;i<=d;i++)
        {
            System.out.println(i);
            j++;
        }
        return j;
    }
    
    // //WANR
    // void fi()
    // {
    //    int i,j;
    //    for(i=n;i<=d;i++)
    //    {
    //     System.out.println(i);
    //     j++;
    //    }


    // }
}

public class ex {
  public static void main(String[] args) {
    M g=new M();
    g.find();
    System.out.println();
    System.out.println("NUMBER in SERIES:"+g.sum());
    System.out.println();
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the value:");
    int n=s.nextInt();
    System.out.print("Enter the value:");
    int d=s.nextInt();
    // System.out.println("NUMBER in SERIES:"+g.fi(n,d));    
  }
}
