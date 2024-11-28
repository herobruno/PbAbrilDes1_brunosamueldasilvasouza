public class Main {
    public static void main(String[] args) {
        Person lily = new Person("Lily");
        lily.addSpouse(new Person("Wilhelm"));

        Person opa = new Person("Opa", lily);
        opa.addSpouse(new Person("Oma"));

        Person reinhold = new Person("Reinhold", opa);
        Person wilma = new Person("Wilma", opa);
        Person sigrid = new Person("Sigrid", opa);


        reinhold.addSpouse(new Person("Sonia"));
        Person christian = new Person("Christian", reinhold);
        Person gabrielle = new Person("Gabrielle", reinhold);
        Person sabine = new Person("Sabine", reinhold);


        christian.addSpouse(new Person("Monica"));
        Person oscar = new Person("Oscar", christian);
        Person lorena = new Person("Lorena", christian);


        wilma.addSpouse(new Person("Rodolfo"));
        Person ricardo = new Person("Ricardo", wilma);
        Person rodrigo = new Person("Rodrigo", wilma);


        ricardo.addSpouse(new Person("Debora"));


        sigrid.addSpouse(new Person("Peter"));
        Person martin = new Person("Martin", sigrid);
        Person thomas = new Person("Thomas", sigrid);
        Person claudia = new Person("Claudia", sigrid);


        martin.addSpouse(new Person("Carla"));
        martin.addChild(new Person("Nicolas"));


        lily.printFamilyTree(0);
    }
}
