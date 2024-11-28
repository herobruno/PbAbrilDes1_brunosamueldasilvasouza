public class Child extends Person {
    private final Adult responsible;

    public Child(String name, int age, Adult responsible) {
        super(name, age);
        this.responsible = responsible;
    }

    public Child(String name, int age) {
        super(name, age);
        this.responsible = null;
    }

    public Adult getResponsible() {
        return responsible;
    }
}
