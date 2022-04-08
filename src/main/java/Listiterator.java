import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Listiterator {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
//        for (int i = 0; i < 10; i++)
//            list.add(i);
        list.add("Manpreet");
        list.add("Abhay");
        list.add("Param");
        ListIterator itr = list.listIterator();
        while (itr.hasNext())
            System.out.println(itr.next());
        System.out.println("next index =" + itr.nextIndex());
        System.out.println("Previous index=" + itr.previousIndex());
        System.out.println("Previous="+itr.previous());
        itr.set("Khangura");
        System.out.println(list);

        //System.out.println(list);
    }
}
