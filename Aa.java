package pack;
public class Aa
{
    int i,j;
   public Aa(int x,int y)
    {
        i=x;
        j=y;
    }
   public void display()
    {
        System.out.println("Addition:"+(i+j));
    }
    public static void main(String[] args) {
        System.out.println("Hello I am your Package");
    }
}