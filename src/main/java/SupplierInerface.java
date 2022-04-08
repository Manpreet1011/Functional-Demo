import java.util.function.Supplier;

public class SupplierInerface {
    public static void main(String[] args) {
        Supplier<String> s=()->{String[] s1={"a","B","c"};
        int x= (int)(Math.random()*2+1);
       return s1[x];};
        System.out.println(s.get());
        System.out.println(s.get());
    }


}
