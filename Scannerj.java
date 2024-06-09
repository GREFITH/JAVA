import java.util.*;
public class Scannerj {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the value of a:");
    int a=s.nextInt();
    System.out.println("Enter the value of b:");
    int b=s.nextInt();
    int sum=a+b;
    System.out.println("ADD:"+sum);
    int sub=a-b;
    System.out.println("SUB:"+sub);
    int MUL=a*b;
    System.out.println("MUL:"+MUL);
    int div=a/b;
    System.out.println("DIV:"+div);
  }
    
}
