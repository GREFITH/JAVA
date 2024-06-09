import java.util.*;

public class test1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int b, r, w, i = 0;
    int a[] = new int[100];
    System.out.println("Who you are:");
    w = s.nextInt();
    while (true)
     {
      if (w == 0)
       {
        System.out.println("Admin");
        System.out.println("New Admission");
        b = s.nextInt();
        if (b == 2) 
        {
          System.out.println("Enter the rollno:");
          a[i] = s.nextInt();
          i++;
          System.out.println("Admission confirmed");
          System.out.println("you want to repeat:");
          r = s.nextInt();
          if (r == 4)
           {
            // System.out.println();
            continue;
          }
           else if (r == 5) 
           {
            break;
          }
        } 
        else if (b == 3)
         {
          System.out.println("you want to repeat:");
          r = s.nextInt();
          if (r == 4) 
          {
            // System.out.println();
            continue;
          } 
          else if (r == 5) 
          {
            System.out.println("Who are you");
            w = s.nextInt();
            // break;
          }
        } 
        else
        {
          System.out.println("invalid");
         }
        // else
        // {
        // System.out.println("Enter the rollno:");
        // d = s.nextInt();
        // }
      } 
      else if (w == 1)
      {
        System.out.println("Student:");
        b = s.nextInt();
        if (b == 2) 
        {

          System.out.println("Enter the rollno:");
          a[i] = s.nextInt();
          i++;
          System.out.println("Admission confirmed");
          System.out.println("you want to repeat:");
          r = s.nextInt();
          if (r == 4) 
          {
            // System.out.println();
            continue;
          }
           else if (r == 5)
          {

            break;
          }
        } 
        else if (b == 3) 
        {
          System.out.println("you want to repeat:");
          r = s.nextInt();
          if (r == 4) 
          {
            // System.out.println();
            continue;
          }
           else if (r == 5) 
           {

            break;
          }
        }
      } 
      else
       {
        System.out.println("Invalid");
        // System.out.println("Who are you");
        // w = s.nextInt();
        // goto w;

        // continue;
        // break;

      }
    }
  }
}
