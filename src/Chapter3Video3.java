import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Chapter3Video3 {


    public static void main(String[] args){
        Integer[] myArray = {1,2,3,4,5,6,7,8,9,20};
        List<Integer> listOfInteger = new ArrayList<>(Arrays.asList(myArray));

        BinaryOperator<Integer> getSum = (acc,x)->acc+x;

        Integer sum = listOfInteger.stream().reduce(0,getSum);
        System.out.println(sum);

        //Getting Max and Min out of an Array
        System.out.println(listOfInteger.stream().max(Comparator.comparing(Integer::intValue)).get());

        System.out.println(listOfInteger.stream().distinct().collect(Collectors.toList()));

    }

}
