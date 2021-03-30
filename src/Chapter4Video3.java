import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Chapter4Video3 {

    public static class Employee {
        public final String name;
        public final Integer age;
        public final String jobTitle;
        public final Float salary;

        public Employee(String name, Integer age, String jobTitle, Float salary) {
            this.name = name;
            this.age = age;
            this.jobTitle = jobTitle;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", jobTitle='" + jobTitle + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }

    public static void main(String[] args){
       Employee[] employeesArr = {
                new Employee("John", 34, "developer", 80000f),
                new Employee("Hannah", 24, "developer", 95000f),
                new Employee("Bart", 50, "sales executive", 100000f),
                new Employee("Sophie", 49, "construction worker", 40000f),
                new Employee("Darren", 38, "writer", 50000f),
                new Employee("Nancy", 29, "developer", 75000f),
        };
        List<Employee> employees = new ArrayList<>(Arrays.asList(employeesArr));

        Function<Integer,Integer> twoTime = (x)->x*2;
        Function<Integer,Integer> subtractOne = (x)->x-1;
        Function<Integer,Integer> twoTimesMinusOne = subtractOne.compose(twoTime); //.andThen()

        System.out.println(twoTimesMinusOne.apply(10));

        Function<Employee,String>getNames  = (employee)->employee.name;
        Function<String,String>strReverse = (str)->new StringBuilder(str).reverse().toString();
        Function<String,String>upperCase = (str)->str.toUpperCase();

        Function<Employee,String>reverseUpperCase = getNames.andThen(strReverse).andThen(upperCase);

        List<String> result = employees
                .stream()
                .map(reverseUpperCase)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
