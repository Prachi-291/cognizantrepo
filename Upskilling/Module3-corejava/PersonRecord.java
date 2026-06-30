import java.util.List;

record Person(String name, int age) {}

public class PersonRecord {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Amit",22),
                new Person("Rahul",18),
                new Person("Priya",25)
        );

        people.stream()
              .filter(p -> p.age() >= 21)
              .forEach(System.out::println);
    }
}
