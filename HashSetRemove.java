import java.util.*;
public class HashSetRemove {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<String>();
        {
            set.add("HARSH");
            set.add("ssvdsf");
            set.add("egtfvg");
            set.add("egtrfs");
            set.add("etfg");
            set.add("gte");
            System.out.println("An inital list of elements"+set);
            set.remove("HARSH");
            System.out.println("After removing an element"+set);
            HashSet<String> set1=new HashSet<String>();
            set.add("jjjioioi");
            set.add("hgbjerkr");
            set.addAll(set1);
            System.out.println("Updated list"+set);
            set.removeAll(set1);
            System.out.println("After removing all elements"+set);
            set.removeIf(str->str.contains("jjjioioi"));
            System.out.println("After removing all elements"+set);
            set.clear();
            System.out.println("After clearing all elements"+set);

        }    
    }    
}
