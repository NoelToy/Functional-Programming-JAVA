import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Chapter3Challenge1 {
    static class Person {
        public final String name;
        public final Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }

    static class Car {
        public final String make;
        public final String color;
        public final Float price;

        public Car(String make, String color, Float price) {
            this.make = make;
            this.color = color;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "make='" + make + '\'' +
                    ", color='" + color + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

    static class Employee {
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
    }

    public static void main(String[] args) {
        Person[] peopleArr = {
                new Person("Brandon", 23),
                new Person("Hank", 43),
                new Person("Jenna", 33),
                new Person("Veronica", 56),
                new Person("Jack", 27),
        };
        List<Person> people = new ArrayList<>(Arrays.asList(peopleArr));

        //Get the List Containing name of the persons only;
        // Answer 1 goes here

        Function<Person,String> getName = (person)->person.name;
        List<String> personNames = people.stream().map(getName).collect(Collectors.toList());
        System.out.println(personNames);

        Car[] carsArr = {
                new Car("Chevy", "red", 45000f),
                new Car("Ford", "blue", 23000f),
                new Car("Toyota", "grey", 14000f),
                new Car("Lamborghini", "blue", 150000f),
                new Car("Renault", "blue", 150000f),
        };
        List<Car> cars = new ArrayList<>(Arrays.asList(carsArr));

        //Get the cars with blue color only;
        // Answer 2 goes here

        Function<String, Predicate<Car>> createCarFilter = (color)->(car)->car.color.equals(color);
        Predicate<Car> blueCarFilter = createCarFilter.apply("blue");
        List<Car> blueCarList = cars.stream().filter(blueCarFilter).collect(Collectors.toList());
        System.out.println(blueCarList);

        Employee[] employeesArr = {
                new Employee("John", 34, "developer", 80000f),
                new Employee("Hannah", 24, "developer", 95000f),
                new Employee("Bart", 50, "sales executive", 100000f),
                new Employee("Sophie", 49, "construction worker", 40000f),
                new Employee("Darren", 38, "writer", 50000f),
                new Employee("Nancy", 29, "developer", 75000f),
        };
        List<Employee> employees = new ArrayList<>(Arrays.asList(employeesArr));

        //Get the total salary;
        // Answer 3 goes here
        Function<Employee,Float> getSalary = (emp)->emp.salary;
        Function<Employee,String> getEmployeeName = (emp)->emp.name;
//        Float totalSalary = employees.stream().map((emp)->emp.salary).reduce(0f,(acc,x)->acc+x);
        Float totalSalary = employees.stream().map(getSalary).reduce(0f,(acc,x)->acc+x);
        System.out.println(employees.stream().map(getEmployeeName).collect(Collectors.toList()));
        System.out.println("Total Salary of the Employees is: "+totalSalary);

    }
}
