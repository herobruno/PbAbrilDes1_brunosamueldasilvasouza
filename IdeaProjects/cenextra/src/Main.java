import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a mensagem:");
        String message = scanner.nextLine();

        int happyCount = countOccurrences(message, ":-)");
        int sadCount = countOccurrences(message, ":-(");

        if (happyCount > sadCount) {
            System.out.println("divertido");
        } else if (sadCount > happyCount) {
            System.out.println("chateado");
        } else {
            System.out.println("neutro");
        }
    }

    private static int countOccurrences(String message, String pattern) {
        int count = 0;
        int index = 0;

        while ((index = message.indexOf(pattern, index)) != -1) {
            count++;
            index += pattern.length();
        }
        return count;
    }
}
