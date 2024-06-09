import java.util.*;
import java.lang.Thread;
import java.io.*;
public class Testsleepmethod2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(true)
        {
            try
            {
                System.out.println("Enter the no:");
                int n=s.nextInt();
                if(n==0)
                {
                    Thread.sleep(5000);
                    throw new Exception("server down...");
                }
                else if(n==1)
                {
                    System.out.println("Payment sucessful...");
                    break;
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
                
            }
        }
    }
}
