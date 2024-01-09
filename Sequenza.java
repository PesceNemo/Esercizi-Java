import java.util.Scanner;

public class Sequenza {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner keyboard = new Scanner(System.in);

        // Declaration of variables

        int numero;
        int numeroCalcoli;

        // Declaration of variables for the frequency of digits 0 to 9
        int cifra0 = 0;
        int cifra1 = 0;
        int cifra2 = 0;
        int cifra3 = 0;
        int cifra4 = 0;
        int cifra5 = 0;
        int cifra6 = 0;
        int cifra7 = 0;
        int cifra8 = 0;
        int cifra9 = 0;

        int cifraCorrente;

        // Message to the user
        System.out.println("Inserire una sequenza di numeri chiusa da uno 0");
        numero = keyboard.nextInt();

        // Check if the sequence is empty
        if (numero == 0)
            System.out.println("Sequenza vuota.");
        else {
            do {
                // Reset the counting variables before processing the new sequence
                cifra0 = 0;
                cifra1 = 0;
                cifra2 = 0;
                cifra3 = 0;
                cifra4 = 0;
                cifra5 = 0;
                cifra6 = 0;
                cifra7 = 0;
                cifra8 = 0;
                cifra9 = 0;

                // Initialization of the calculation variable
                numeroCalcoli = numero;

                // Loop to count the digits in the sequence
                while (numeroCalcoli > 0) {
                    cifraCorrente = numeroCalcoli % 10;
                    numeroCalcoli = numeroCalcoli / 10;
                    
                    //Increment of the frequency variable corresponding to the current digit
                    switch (cifraCorrente) {
                        case 0:
                            cifra0++;
                            break;
                        case 1:
                            cifra1++;
                            break;
                        case 2:
                            cifra2++;
                            break;
                        case 3:
                            cifra3++;
                            break;
                        case 4:
                            cifra4++;
                            break;
                        case 5:
                            cifra5++;
                            break;
                        case 6:
                            cifra6++;
                            break;
                        case 7:
                            cifra7++;
                            break;
                        case 8:
                            cifra8++;
                            break;
                        case 9:
                            cifra9++;
                            break;
                    }
                }

                // Printing frequencies of non-zero digits
                if (cifra0 > 0)
                    System.out.println("Frequenza cifra 0 : " + cifra0);
                if (cifra1 > 0)
                    System.out.println("Frequenza cifra 1 : " + cifra1);
                if (cifra2 > 0)
                    System.out.println("Frequenza cifra 2 : " + cifra2);
                if (cifra3 > 0)
                    System.out.println("Frequenza cifra 3 : " + cifra3);
                if (cifra4 > 0)
                    System.out.println("Frequenza cifra 4 : " + cifra4);
                if (cifra5 > 0)
                    System.out.println("Frequenza cifra 5 : " + cifra5);
                if (cifra6 > 0)
                    System.out.println("Frequenza cifra 6 : " + cifra6);
                if (cifra7 > 0)
                    System.out.println("Frequenza cifra 7 : " + cifra7);
                if (cifra8 > 0)
                    System.out.println("Frequenza cifra 8 : " + cifra8);
                if (cifra9 > 0)
                    System.out.println("Frequenza cifra 9 : " + cifra9);

                // Request a new number from the user
                numero = keyboard.nextInt();
            } while (numero != 0);
        }
    }
}
