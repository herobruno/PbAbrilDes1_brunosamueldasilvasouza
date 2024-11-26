import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Person spouse;
    private List<Person> children;


    public Person(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }


    public Person(String name, Person parent) {
        this(name);
        parent.addChild(this);
    }



    public void addChild(Person child) {
        this.children.add(child);
    }
    public void addSpouse(Person spouse) {
        this.spouse = spouse;
        if (spouse.spouse != this) {
            spouse.addSpouse(this);
        }
    }
}
