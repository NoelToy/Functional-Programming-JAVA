import java.util.function.BiFunction;
import java.util.function.Function;

public class Chapter2Video8 {


    public static void main(String[] args){
        BiFunction<Float,Float,Float> divide = (x,y)->x/y;

        Function<BiFunction<Float,Float,Float>,BiFunction<Float,Float,Float>> secondArgumentZeroCheck =
                (fun)-> (x,y)->{
                    if(y==0f){
                        System.out.println("Error:Division By Zero");
                        return 0f;
                    }
                    return fun.apply(x,y);
                };
        BiFunction<Float,Float,Float>safeDivide = secondArgumentZeroCheck.apply(divide);
        System.out.println(safeDivide.apply(20f,0f));
        System.out.println(safeDivide.apply(20f,2f));

    }

}
