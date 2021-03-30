import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Chapter3Video1 {


    public static void main(String[] args){


        Function<Integer,Function<Integer,Integer>> myCustomFunc = (y)->(x)->x*y;

        Function<Integer,Integer> myDouble = (x)->x*2; //Double Function

        Function<Integer,Integer> myCustomTriple = myCustomFunc.apply(3);


        Integer[] myArray = {1,5,8,9,22,2};
        List<Integer> listOfInteger = new ArrayList<>(Arrays.asList(myArray));

        System.out.println(listOfInteger.stream().map(myDouble).collect(Collectors.toList()));
        System.out.println(listOfInteger.stream().map(myCustomTriple).collect(Collectors.toList()));

        /*Sort in Stream*/
        System.out.println(listOfInteger.stream().sorted().collect(Collectors.toList()));
        System.out.println(listOfInteger.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

    }
}
