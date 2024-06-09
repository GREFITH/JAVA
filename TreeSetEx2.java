import java.util.*;
public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<String>();
        ts.add("dfg");    
        ts.add("dffsd");    
        ts.add("dfgsf");    
        ts.add("dfgrw");
        System.out.println("Traversing element through Iterator in descending order");
        Iterator i=ts.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}