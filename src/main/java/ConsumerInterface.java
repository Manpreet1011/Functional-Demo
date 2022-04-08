import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
        Consumer<String> c= System.out::println;
        c.accept("Hello");
        c.accept("Hi");
        Consumer<String> c1= s-> System.out.println(s);
        c1.accept("Manpreet");


    }
}
