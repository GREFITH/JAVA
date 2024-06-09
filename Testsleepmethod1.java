import java.lang.Thread;
import java.io.*;
public class Testsleepmethod1 {
    public static void main(String[]args)
    {
        int i;
        try
        {
            for(i=0;i<5;i++)
            Thread.sleep(1000);
            System.out.println(i);
        }
        catch(Exception expn)
        {
            System.out.println(expn);
        } 
    }
    
}
