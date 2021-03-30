public class Chapter2Video4 {

    protected  static  class Person{
        private String name;
        private  Integer age;

        public Person(String name,Integer age){
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    protected static class DataLoader{

        public NoArgFunction<Person> personLoader;

        public DataLoader(Boolean isDevelopement){

            if(isDevelopement){
                personLoader=this::dataLoaderFake;
            }
            else{
                personLoader=this::dataLoaderReal;
            }
        }

        public Person dataLoaderReal(){
            System.out.println("Data Loading......");
            return new Person("Real Person",30);
        }
        public Person dataLoaderFake(){
            System.out.println("The Data loaded is fake......");
            return new Person("Fake Person",100);
        }
    }


    public static void main(String[] args){
        DataLoader dataLoader = new DataLoader(false);
        System.out.println(dataLoader.personLoader.apply());
    }


}
