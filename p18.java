class xe
{
    int a=10;
    final int b=20;
    void display()
    {
        System.out.println("Square of a:"+a*a);
        // b=b*b*b;
        // System.out.println("Cube of b:"+b*b*b);
        System.out.println("Cube of b:"+b);
    }
}
class p18
{
    public static void main(String[] args) {
        xe o=new xe();
        o.display();
    }
}