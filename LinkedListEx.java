import java.util.*;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Grefith");
        list.add("Harsh");
        list.add("Dev");
        list.add("Kiara");
        Iterator<String> itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}