import java.util.*;
public class test {
      public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int b,c,r,w,i=0;
        int a[]= new int [100];
        System.out.println("Who you are:");
        w=s.nextInt();
        while(true)
        {
        if(w==0)
        {
            System.out.println("Admin");
            System.out.println("New Admission");
            b=s.nextInt();
            if(b==2)
            {
                System.out.println("Enter the rollno:");
                a[i]=s.nextInt();
                i++;
                System.out.println("you want to repeat:");
                r=s.nextInt();
                if (r==4) {
                  // System.out.println();
                  continue;
                }
            }
            // else
            // {
            //     System.out.println("Enter the rollno:");
            //     d = s.nextInt();
            // }
    //     }
    //     else if(a==1)
    //     {
    //         System.out.println("Student:");
    //         c=s.nextInt(); 
    //         if(c==3)
    //         {
    //           System.out.println("Enter the rollno:");
    //           d=s.nextInt();
    //         }  
    //         // else if(d==3)
    //         // {
    //         //     System.out.println("you want to repeat:");
    //         //     e=s.nextInt();
    //         //     if(e==4)
    //         //     {
    //         //         System.out.println("New Admission");
    //         //     }

    //         // }         
    //     }
    //     else
    //     {
    //         System.out.println("Invalid");

        }
      }
    }      
          
}
