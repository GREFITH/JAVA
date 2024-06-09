 class ad {
     protected int a=10;
    void jk()
    {
        System.out.println(a);
    }
class don extends ad
{
    void hj()
    {
        System.out.println(a);
    }
}
}
class c
{
    public static void main(String[] args)
    {
        don d=new don();
        d.hj();
    }
}
