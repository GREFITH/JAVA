class f
{
    int fact(int n)
    {
        int result;
        if(n==1)
        return 1;
    result=fact(n-1)*n;
        return result;


    }
}
class recursion
{
    public static void main(String args[])
    {
        f h=new f();
        System.out.println("FActorial of 3:"+h.fact(3));
    }
}