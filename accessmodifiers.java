public class accessmodifiers {
  public class ak{

       private int a=10;
       void jk()
       {
           System.out.println(a);
        }
    }
    protected int b=90;
    void df()
    {
        System.out.println(a);
        System.out.println(b);

        
    }
}
class accessmodifiers1
{
    public static void main(String[] args)
    {
        accessmodifiers a=new accessmodifiers();
        a.df();
        // accessmodifiers.ak hj= accessmodifiers.new accessmodifiers.ak();
        
        // hj.jk();
    }
}