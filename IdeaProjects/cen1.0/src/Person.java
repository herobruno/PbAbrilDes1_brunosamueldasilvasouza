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


    public void printFamilyTree(int level) {

        String indent = "  ".repeat(level);


        System.out.print(indent + this.name);

        if (this.spouse != null) {
            System.out.print(" -- Married to: " + this.spouse.name);
        }

        if (this.children.isEmpty()) {
            System.out.println(" -- Single");
        } else {
            System.out.println(" -- Children:");
            for (Person child : this.children) {
                child.printFamilyTree(level + 1);
            }
        }
    }
}