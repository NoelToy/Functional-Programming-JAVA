import java.util.function.Function;

public class Chapter2Video2 {

    public static void main(String[] args) {
        Function<String,Integer> myStringLengthCalculator = (myString)->myString.length();
        Integer result = myStringLengthCalculator.apply("His name is Noel Toy");
        System.out.println("The Length of the String is: "+result);
    }
}
