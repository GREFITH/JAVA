class Me
{
    int a,b;
    Me(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void disc()
    {
        System.out.println("ADD:"+(a+b));
    }
}
public class thiskey {
    public static void main(String[] args) {
        Me o=new Me(3,4);
        o.disc();
    }
    
}
