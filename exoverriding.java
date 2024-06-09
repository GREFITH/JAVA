class Bank1
{
    void interest()
    {
        double p=7584,r=4.5,n=7;
        double sum=(p*r*n)/100;
        System.out.println("BANK1:"+sum);
        }
}
class Bank2 extends Bank1
{
    void interest()
    {
        double p=75845,r=42.5,n=11;
        double sum=(p*r*n)/100;
        System.out.println("BANK2:"+sum);
        }
}
class Bank3 extends Bank1
{
    void interest()
    {
        double p=345840,r=32.5,n=12;
        double sum=(p*r*n)/100;
        System.out.println("BANK3:"+sum);
        }
}
class Bank4 extends Bank3
{
    void interest()
    {
        double p=325423,r=12.5,n=40;
        double sum=(p*r*n)/100;
        System.out.println("BANK4:"+sum);
        }
}
class Bank5 extends Bank2
{
    void interest()
    {
        double p=7545423,r=45.5,n=54;
        double sum=(p*r*n)/100;
        System.out.println("BANK5:"+sum);
        }
}
public class exoverriding {
    public static void main(String[] args) {
        Bank1 b=new Bank1();
        b.interest();
        Bank2 g=new Bank2();
        g.interest(); 
        // g.interest(); 
        Bank3 f=new Bank3();
        f.interest();
        Bank4 h=new Bank4();
        h.interest();
        Bank5 j=new Bank5();
        j.interest();
    }
       
}