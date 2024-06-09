import java.util.*;
class collection
{
    public static void main(String[]args)
    {
        ArrayList<String> li=new ArrayList<String>();
        {
            li.add("hello");
            li.add("hi");
            li.add("how are you");
            li.remove("hello");
            System.out.println(li);
            Iterator<String> itr= li.iterator();
            while(itr.hasNext())
            {
                System.out.println(itr.next());
            }
        }
        LinkedList<String> al=new LinkedList<String>();
        {
            al.add("hello");
            al.add("hi");
            al.add("how are you");
            System.out.println(al);
        }
        Vector<String> v=new Vector<String>();
        {
            v.add("hello");
            v.add("hi");
            v.add("how are you");
            System.out.println(v);
        }
        Stack<String> s=new Stack<String>();
        {
            s.push("hello");
            s.push("hi");
            s.push("how are you");
            System.out.println(s);
        }
        TreeSet<String> t=new TreeSet<String>();
        {
            t.add("hello");
            t.add("hi");
            t.add("how are you");
            System.out.println(t);
        }
    }
}
