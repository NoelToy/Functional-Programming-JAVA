import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Chapter4Video1 {


    public static void main(String[] args){
        TriFunction<Integer,Integer,Integer,Integer> add = (x,y,z)->x+y+z;

        /*Partial Application*/
        Function<Integer, BiFunction<Integer,Integer,Integer>> customAdd = (x)->(y,z)->add.apply(x,y,z);

        BiFunction<Integer,Integer,Integer> addFive = customAdd.apply(5);

        System.out.println(addFive.apply(6,7));

        BiFunction<Integer,Integer,Function<Integer,Integer>> customDoubleAdd = (x,y)->(z)->add.apply(x,y,z);
        Function<Integer,Integer> addSixSeven = customDoubleAdd.apply(6,7);
        System.out.println(addSixSeven.apply(5));

        /*Curring Example*/
        Function<Integer,Function<Integer,Function<Integer,Integer>>> addPartial = (x)->(y)->(z)->add.apply(x,y,z);
        Function<Integer,Function<Integer,Integer>> add5 = addPartial.apply(5);
        Function<Integer,Integer> add5And6 = add5.apply(6);
        Integer sum = add5And6.apply(7);
        System.out.println(sum);

    }

}
