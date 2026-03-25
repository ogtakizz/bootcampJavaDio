import java.time.OffsetDateTime;

import static java.time.Year.now;

public class Person {
    private final String name;
    private int age = 1;

    public Person(String name) {
        this.name = name;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void imprime() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
}
