class Ae
{
    static int a1=0;
        static void v1()
        {
            a1=5;
        }
        Ae()
        {
            System.out.println(a1);
            a1++;
        }
}
public class staticmethod {
    public static void main(String[] args) {
        Ae obj=new Ae();
        obj.v1();
        Ae obj1=new Ae();
        Ae obj2=new Ae();
    }
    
}
