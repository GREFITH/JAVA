abstract view
{
    protected void view()
    {
        System.out.println("Constructor");
    }
    private void test()
    {
        System.out.println("test Method");
    }
    private abstract void demo();
}
class dummy extends view {
    dummy()
    {
        System.out.println("Dummy Method");
        super();
    }
    public static void main(String[]args)
    {
        dummy d=new dummy();
        d.demo();
    }
    @Override
    protected void demo()
    {
        System.out.println("Demo Method");
    }
}