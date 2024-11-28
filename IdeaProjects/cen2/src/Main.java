public class Main {
    public static void main(String[] args) {
        FerrisWheel ferrisWheel = new FerrisWheel(); // Creating a new Ferris wheel
        Adult paulo = new Adult("Paulo", 42); // Adult Paulo

        // Paulo's children
        Child joao = new Child("Joao", 5, paulo); // Child João with father Paulo
        Child maria = new Child("Maria", 12, paulo); // Daughter Maria with father Paulo

        // Children without a defined father
        Child pedro = new Child("Pedro", 13); // Child Pedro, without a father
        Child henrique = new Child("Henrique", 10); // Child Henrique, without a father

        /*
         * Now comes the interesting part. A rule has been created in the park:
         * - Children under 12 years old can only ride when accompanied by their parents!
         */

        // Trying to board João
        ferrisWheel.board(2, joao, paulo); // OK: João boards with father Paulo
        ferrisWheel.board(3, maria); // OK: Maria is 12 years old and can ride alone
        ferrisWheel.board(13, pedro); // OK: Pedro can ride alone
        ferrisWheel.board(16, henrique); // ERROR: Henrique is under 12 and we don't know who the father is

        ferrisWheel.status(); // Displaying the status of the gondolas
    }
}
