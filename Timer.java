import java.util.Scanner;

public class Timer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the seconds
        System.out.print("Inserisci il numero di secondi trascorsi oggi: ");
        int secondi = scanner.nextInt();

        // Checks whether the entered value is null or greater than one day
        while (secondi <= 0 || secondi >= 86400) {
            System.out.println("Inserisci un valore valido (maggiore di 0 e minore di 86400): ");
            secondi = scanner.nextInt();
        }

        // Calculate the hour, minutes and seconds
        int ore = secondi / 3600;
        int minuti = (secondi % 3600) / 60;
        int secondiRimanenti = secondi % 60;

        // Show the current time
        System.out.printf("%d(ore):%d(minuti):%d(secondi)%n", ore, minuti, secondiRimanenti);

        // Close the scanner
        scanner.close();
    }
}
