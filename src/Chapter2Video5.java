import java.util.function.BiFunction;

public class Chapter2Video5 {


    public static class MyMath{
        public static Integer add(Integer x,Integer y){
            return x+y;
        }
        public static Integer subtract(Integer x,Integer y){
            return x-y;
        }
        public static Integer combinedExecutor(BiFunction<Integer,Integer,Integer>biFunction){
            return biFunction.apply(10,20);
        }
    }

    public static void main(String[] args){
        System.out.println(MyMath.combinedExecutor(MyMath::add));
        System.out.println(MyMath.combinedExecutor(MyMath::subtract));
        System.out.println(MyMath.combinedExecutor((x,y)->x*2+y*3));
    }

}
