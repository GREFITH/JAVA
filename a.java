

class a
{
    public static int test(int x, int y)
{
    
if (x == y)
return x;
else if (x > y)
return (x + y);
else
return test(x + 1, y - 1);
}
    public static void main(String[]args)
    {
        System.out.println(test(5,10));
    }
}