import java.util.function.Function;

public class Chapter2Video1 {

    protected static class MyMath{
        public static Integer triple(Integer x){
            return x * 3;
        }
    }


    public static void main(String[] args) {
        Function<Integer,Integer> myTriple = MyMath::triple;
        Integer result = myTriple.apply(20);
        System.out.println("The Restult is: "+result);
    }
}
