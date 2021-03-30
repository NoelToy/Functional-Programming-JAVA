import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Chapter3Video2 {


    public static void main(String[] args){
        Integer[] myArray = {1,2,3,4,5,6,7,8,9,20};
        List<Integer> listOfInteger = new ArrayList<>(Arrays.asList(myArray));

        Predicate<Integer> evenChecker = (x)->{
            if(x%2==0){
                return true;
            }
            else{
               return false;
            }
        };
        System.out.println(listOfInteger.stream().filter(evenChecker).collect(Collectors.toList()));

        String[] myStringArray = {"hello","to","the","world","of","functional","programming"};
        List<String> listOfStrings = new ArrayList<>(Arrays.asList(myStringArray));


        Predicate<String> stringLength = (str)->str.length()>=5;
        System.out.println(listOfStrings.stream().filter(stringLength).collect(Collectors.toList()));

        Function<Integer,Predicate<String>> myCustomeLengthChecker = (x)->(str)->str.length()>x;
        Predicate<String> stringLengthSix = myCustomeLengthChecker.apply(6);
        System.out.println(listOfStrings.stream().filter(stringLengthSix).collect(Collectors.toList()));
    }

}
