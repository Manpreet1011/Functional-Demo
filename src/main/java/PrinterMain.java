import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class PrinterMain {
    public static void main(String[] args) {
//        Printer p =new Printer() {
//            @Override
//            public void print() {
//                System.out.println("Printer");
//            }
//        };
//        //System.out.println();
//        p.print();
        MapperFunction m =(n,x)->n*x;
        System.out.println(m.print(5,3));
        Printer p= (n)->n<5;
        System.out.println(p.print(2));
        List<Integer> l= Arrays.asList(1,4,2,5,7,89);
        l.forEach(x-> System.out.println(x*2));
        System.out.println(l.stream().filter(e->e%2==0));


    }

}
