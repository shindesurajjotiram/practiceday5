package customerobjectsetoperation;

import java.util.HashSet;
import java.util.Objects;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class CustomerObjectSetOperation {
    public static void main(String[] args) {
        HashSet<Person> personSet = new HashSet<>();

        Person alice = new Person("Alice", 30);
        Person bob = new Person("Bob", 25);

        personSet.add(alice);
        personSet.add(bob);

        Person searchPerson = new Person("Alice", 30);
        System.out.println("Is Alice in the set? " + personSet.contains(searchPerson));
    }
}
