class Me
{
    int a,b;
     Me(int a,int b)
    {
        a=a;
        b=b;
    }
    void disc()
    {
        // System.out.println("ADD:"+(a+b));
        
        System.out.println(a+b);
    }
}
public class thiskeymethod {
    public static void main(String[] args) {
        Me o=new Me(5,3);
        o.disc();
    }
    
}
