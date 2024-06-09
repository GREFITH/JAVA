import java.util.*;

public class test2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a[] = new int[100];
        int b, c, d = 0, e, v, x;
        System.out.println("Who you are:");
        b = s.nextInt();
        while (true) {
            if (b == 0) {
                System.out.println("Admin:");
                x = s.nextInt();
                if (x == 2) {
                    System.out.println("New Admission:");
                    c = s.nextInt();
                    if (c == 2) {
                        System.out.println("Enter the roll no:");
                        a[d] = s.nextInt();
                        d++;
                        System.out.println("You want to repeat:");
                        e = s.nextInt();
                        if (e == 2) {
                            continue;
                        } else if (e == 3) {
                            // continue;
                            System.out.println(a[d]);
                            // System.out.println("who you are");
                            // b = s.nextInt();
                            break;
                        }
                        
                    }
                    else if (c==3) {
                        System.out.println("who you are:");
                        b=s.nextInt();
                    }
                    
                } else if (x == 3) {
                    // System.out.println();
                    System.out.println("Who you are:");
                    b = s.nextInt();
                    continue;
                }
            }
                 else if (b == 1) {
                    System.out.println("Student:");
                    v = s.nextInt();
                    if (v == 2) 
                    // {
                        // System.out.println("New Admission:");
                        // c = s.nextInt();
                        // if (c == 2) 
                        {
                            System.out.println("Enter the roll no:");
                            a[d] = s.nextInt();
                            d++;
                            System.out.println("Thank you");
                            break;
                        } else if (v == 3) {
                            System.out.println("Who you are:");
                            b = s.nextInt();
                            
                        }
                    // }
                }
             else {
                // if () {
                System.out.println("Invalid");
                System.out.println("Who are you:");
                b=s.nextInt();
                continue;
                // }
            }
        }
    }
}
