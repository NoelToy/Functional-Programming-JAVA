import java.util.function.BiFunction;

public class Chapter2Video3 {

    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> add = (Integer x, Integer y)->x+y;
        TriFunction<Integer,Integer,Integer,Integer> addThree = (Integer x,Integer y,Integer z)->x+y+z;
        NoArgFunction<String> greetingsFun = ()->"Hello There, Welcome";
        System.out.println(add.apply(10,30));
        System.out.println(addThree.apply(10,10,10));
        System.out.println(greetingsFun.apply());
    }
}
