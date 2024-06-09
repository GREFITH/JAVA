class A
{
    static int a1=0;
    A() 
        {
            System.out.println(a1);
            a1++;        
        }
    
}
public class statickey {
    public static void main(String[] args) {
        A obj=new A();    
        A obj1=new A();    
        A obj2=new A(); 
        // varaibale is this   
    }
}
