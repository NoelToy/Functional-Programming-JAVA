import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Chapter3Video4 {


    public static void main(String[] args){
        String[] myStringArray = {"hello","to","the","world","of","functional","programming"};
        List<String> listOfStrings = new ArrayList<>(Arrays.asList(myStringArray));

        Map<Integer,List<String>> myGroupedList = listOfStrings.stream().collect(Collectors.groupingBy((word)->word.length()));
        System.out.println(myGroupedList);

        Predicate<String> isGreaterThanFive = (x)->x.length()>5;
        Map<Boolean,List<String>> myPartitionedList = listOfStrings.stream().collect(Collectors.partitioningBy(isGreaterThanFive));
        System.out.println(myPartitionedList);
    }

}
