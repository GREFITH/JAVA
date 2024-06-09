import java.util.*;
public class ArrayListIteratorforeachEx {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");
        for(String fruit:list)
        {
            System.out.println(fruit);
        }

    }
}
