public class Derive {
    public void getDetails()
    {
        System.out.printf("Derived class");
    }
}
public class Test extends Derive
{
    public void getDetails()
    {
    System.out.println("Test Class");
    super.getDetails();
    }
}
public static void main(String[]args)
{
    Derive obj=new Test();
    obj.getDetails();
}