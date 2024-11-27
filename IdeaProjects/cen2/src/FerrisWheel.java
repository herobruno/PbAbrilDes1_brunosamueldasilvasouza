public class FerrisWheel {

    private Gondola[] gondolas;

    public FerrisWheel() {

        this.gondolas = new Gondola[18];
        for (int i = 0; i < 18; i++) {
            gondolas[i] = new Gondola(i);
        }
    }


    public void board(int gondolaNumber, Person... people) {

        if (gondolaNumber < 0 || gondolaNumber >= gondolas.length) {
            System.out.println("Gondola " + gondolaNumber + " não existe.");
            return;
        }

        Gondola gondola = gondolas[gondolaNumber];


        if (gondola.isFull()) {
            System.out.println("Gondola " + gondolaNumber + " is full.");
            return;
        }


        for (Person person : people) {
            if (person instanceof Child) {
                Child child = (Child) person;


                if (child.getAge() < 12 && child.getResponsible() == null) {
                    System.out.println(child.getName() + " cannot ride without a father.");
                    return;
                }
            }
        }


        for (Person person : people) {
            gondola.boardPerson(person);
        }

        System.out.println("Boarded successfully.");
    }


    public void status() {
        for (int i = 0; i < gondolas.length; i++) {
            System.out.print("Gondola " + i + ": ");
            gondolas[i].printStatus();
        }
    }
}
