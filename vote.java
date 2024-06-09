import java.util.*;
public class vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        if(age>=18 )
        {
            System.out.println("Eligible for vote");
        }
        else if (age<18|| age==0) {
            System.out.println("Not eligible for vote");
        }
        else
        {
            System.out.println("Enter the correct age");
        }
    }
}
