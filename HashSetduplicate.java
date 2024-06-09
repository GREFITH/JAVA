import java.util.*;
public class HashSetduplicate {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ajay");
        set.add("Ravi");
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
