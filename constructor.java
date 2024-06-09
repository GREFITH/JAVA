public class constructor {
    constructor()
    {
        System.out.println("I'm a default constructor.");
    }
    constructor(int i, String name)
    {
        System.out.println("parametrized constructor:"+i+" "+name);
    }
    // constructor()
    
}
class constructor1
{
    // pObject foo = new Object();
    public static void main(String [] args)
    {
        constructor obj = new constructor();
        constructor obj1 = new constructor(1,"svgfd");
    }
}
