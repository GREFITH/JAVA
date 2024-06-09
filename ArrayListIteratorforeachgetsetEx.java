import java.util.*;
public class ArrayListIteratorforeachgetsetEx {   
    public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Appple");
        list.add("Oranges");
        list.add("Grapes");
        System.out.println("Returning Element:"+list.get(1));
        list.set(1,"Dates");
        for(String fruit:list)
        {
            System.out.println(fruit);
        }        
        
    }
}