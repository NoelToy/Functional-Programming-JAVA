import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Chapter3Video6 {

    public static void main(String[] args){

        String[] myStringArray = {"hello","to","the","world","of","functional","programming"};
        List<String> listOfStrings = new ArrayList<>(Arrays.asList(myStringArray));

        List<String>processedList =  listOfStrings.parallelStream()
                .map((str)->str.toUpperCase())
                .map((str)->str+"!").collect(Collectors.toList());
        System.out.println(processedList);
    }
}
