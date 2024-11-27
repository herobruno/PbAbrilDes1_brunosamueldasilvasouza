public class Gondola {
    private int number;
    private Person seat1;
    private Person seat2;

    public Gondola(int number) {
        this.number = number;
        this.seat1 = null;
        this.seat2 = null;
    }


    public boolean isFull() {
        return seat1 != null && seat2 != null;
    }


    public void boardPerson(Person person) {
        if (seat1 == null) {
            seat1 = person;
        } else if (seat2 == null) {
            seat2 = person;
        }
    }


    public void printStatus() {
        if (seat1 == null && seat2 == null) {
            System.out.println("Empty");
        } else if (seat1 != null && seat2 == null) {
            System.out.println(seat1.getName());
        } else if (seat1 != null && seat2 != null) {
            System.out.println(seat1.getName() + " and " + seat2.getName());
        }
    }


    public int getNumber() {
        return number;
    }
}
