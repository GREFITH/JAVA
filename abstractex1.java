abstract class P1
{
    abstract void PQR();
}
class P2 extends P1{
    void PQR()
    {
        System.out.println("HELLO");
    }
}
class P3 extends P1
{
    void PQR()
    {
        System.out.println("HII");
    }
}
public class abstractex1 {
    public static void main(String[] args) {
        P1 p=new P2();
        p.PQR();
        P1 p1=new P3();
        p1.PQR();
    }
}
