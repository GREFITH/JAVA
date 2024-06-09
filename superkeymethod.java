class Ae
{
    void sum()
    {
        int a1=21,b1=4;
        System.out.println("ADD:"+(a1+b1));
    }
}
class Be extends Ae
{
    void sum(){
        
        int a1=9,b1=6;
        System.out.println("ADD:"+(a1+b1));
}
    void p()
    {
        super.sum();
    }
}
public class superkeymethod {
    public static void main(String[] args) {
        Be o=new Be();
        o.p();
    }
}
