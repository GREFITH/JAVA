import java.util.*;
public class TreeSetEx4 {
    public static void main(String[]args)
    {
        TreeSet<String> ts=new TreeSet<String>();
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("D");
        ts.add("E");
        System.out.println("Initial set:"+ts);
        System.out.println("Reversed set:"+ts.descendingIterator());
        System.out.println("Headset:"+ts.headSet("C",true));
        System.out.println("Headset:"+ts.subSet("A",false,"E",true));
        System.out.println("Headset:"+ts.tailSet("C",false));
        
    }
    
}
