import java.util.HashMap;
import java.util.Objects;

public class HashMapInternals {
    public static void main(String[] args) {
        HashMap<Person, Integer> map = new HashMap<>();

        Person obj1 = new Person(12, "ankur");
        Person obj2 = new Person(12, "ankur");

        map.put(obj1, 12);
        map.put(obj2, 13);
        System.out.println(map);

    }
}

class Person {

    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
