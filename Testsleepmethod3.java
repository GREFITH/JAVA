import java.util.*;
public class Testsleepmethod3 {
    public static void main(String[] args) {
        int PIN=5762;
       int Bln=100;
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the PIN:");
       int n=s.nextInt();
       while(true)
       {
        try
        {
            if(PIN!=n)
            {
                throw new ArithmeticException("Wrong PIN...");
                // System.out.println("please renter the pin:");
            }
            else if(PIN==n)
            {
                System.out.println("Enter the amount:");
                int a=s.nextInt();
                if(a>Bln)
                {

                    throw new Exception("Insufficient Balance...");
                    
                }
                else
                {
                    System.out.println("Balance is : "+(Bln-a));
                    break;
                }
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("Please R-enter the PIN:");
            n=s.nextInt();
        }
        catch(Exception w)
        {
            System.out.println(w);
            System.out.println("Avaliable Balance:"+Bln+" renter the amount as of available balance");
            // System.out.println("Enter Amount in this range:");
        }
       }
    }
    
}
