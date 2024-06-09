import java.util.*;
public class ArrayListIteratorEx {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Apples");
        list.add("Banana");
        list.add("Citrus");
        list.add("Grapes");
        Iterator itr=list.iterator();
        while(itr.hasNext())    //hasnext is used to check the value is present in arraylist or not.
        {
            System.out.println(itr.next());  //next  is used to to move towards next value.
        }
        // list.add("홍길동");
        // System.out.println(list);
    }
}
