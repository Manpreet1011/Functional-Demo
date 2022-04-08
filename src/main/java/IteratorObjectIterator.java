import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorObjectIterator {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<Integer>();
        ArrayList l=new ArrayList<>();
        for (int i=10;i<20;i++)
            l.add(i);
        System.out.println(l);
        Iterator itr=l.iterator();
        while (itr.hasNext()) {
            Integer n=(Integer)itr.next();
            if(n%2==0)
                System.out.println(n);
            else
                itr.remove();
            //System.out.println(itr.next());
        }
        System.out.println(l);

    }
}
