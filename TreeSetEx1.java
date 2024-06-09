import java.util.*;
class TreeSetEx1
{
    public static void main(String[] args) {
        TreeSet<String> al = new TreeSet<String>();
        al.add("sdds");
        al.add("sdds4rw");
        al.add("sddsetfdv");
        al.add("sdds");
        Iterator<String> i=al.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}