import java.util.function.Function;

public class Chapter2Video6 {

    protected static class MyMath{
        public static Function<Integer,Integer> createMultiplier(Integer y){
            return (x)->x*y;
        }
    }


    public static void main(String[] args){
        NoArgFunction<NoArgFunction<String>> createGreeter = ()->{
            return ()->"Hello to Functional Programming!";
        };
        NoArgFunction<String> greeter = createGreeter.apply();
        System.out.println(greeter.apply());

        Function<Integer,Integer>twoTimes=MyMath.createMultiplier(2);
        Function<Integer,Integer>threeTimes=MyMath.createMultiplier(3);

        System.out.println(twoTimes.apply(4));
        System.out.println(threeTimes.apply(4));
    }

}
