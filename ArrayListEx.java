import java.util.*;
public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apples");
        list.add("Banana");
        list.add("Citrus");
        list.add("Grapes");
        System.out.println(list);
        list.remove("Citrus");
        System.out.println(list);
}
}