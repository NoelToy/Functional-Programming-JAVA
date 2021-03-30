public class Chapter2Video7 {

    public static void main(String[] args){
        NoArgFunction<NoArgFunction<String>> greeterCreater=()->{
          String name = "Noel";
          return ()->"Hello, "+name; //Closure Example
        };
        NoArgFunction<String> greeter = greeterCreater.apply();
        System.out.println(greeter.apply());
    }

}
