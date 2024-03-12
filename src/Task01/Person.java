package Task01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

public class Person {
    private String name, city;
    private int age;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("pekka", 30, "helsinki"));
        persons.add(new Person("matti", 40, "turku"));
        persons.add(new Person("jarkko", 35, "kuopio"));

        persons.sort(Comparator.comparing(n -> n.age));
//        Comparator<Person> comparator = (n1, n2)  -> n2.name.charAt(0) - n1.name.charAt(0);
//        persons.sort(comparator);
        persons.forEach(person -> System.out.println(person.age));
        persons.removeIf(p -> p.city=="turku" || p.city=="kuopio");
        persons.forEach(person -> System.out.println(person.name));

    }
}
