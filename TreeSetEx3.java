import java.util.*;
public class TreeSetEx3 {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<Integer>();
        ts.add(66);
        ts.add(23);    
        ts.add(2);    
        ts.add(24);   
        System.out.println("Lowest Value:"+ts.pollFirst()); 
        System.out.println("Highest Value:"+ts.pollLast()); 
    }    
}
