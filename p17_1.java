class xe
{
    int a=10;
    void show()
    {
       System.out.println("I am parent class:"+a);        
    }
}
class ye extends xe
{
    int b=20;
    void display()
    {
        System.out.println("I am Child class:"+b);
        super.show();
    }
}
class p17_1
{
    public static void main(String[] args) {
        ye o=new ye();
        o.display();
    }
}