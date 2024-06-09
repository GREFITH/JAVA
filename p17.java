class x
{
    int a=10;
}
class y extends x
{
    int b=20;
    void display()
    {
        System.out.println("Parent Varaiable:"+super.a);
        System.out.println("Child Varaiable:"+b);
    }
}
class p17
{
    public static void main(String[] args) {
        y o=new y();
        o.display();
    }
}