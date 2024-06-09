import java.util.*;
public class LinkedListAddElementsEx {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<String>();
        list1.add("fsddf");
        list1.add("HARSH");
        list1.add("kiara");
       System.out.println("After invoking add(E e) method: "+list1);  
       list1.add(1,"sfa");
       System.out.println("After invoking add(int index, E element) method: "+list1);
       LinkedList<String> list2 = new LinkedList<String>();
       list2.add("sfa");
       list2.add("gsdds");
       list1.addAll(list2);
       System.out.println("After invoking addAll(Collection<? extends E> c) method: "+list1);
        LinkedList <String> list3 = new LinkedList<String>();
        list3.add("sfa");
        list3.add("gsdd");
        list1.addAll(1,list3);
        System.out.println("After invoking addALL(int index,collection<? extends E>c) method:"+list1);
        list1.addFirst("Lokesh");
        System.out.println("After invoking addFirst(E e) method: "+list1);
        list1.addLast("Harshujk");
        System.out.println("After invoking addLast(E e) method: "+list1);
}
}
