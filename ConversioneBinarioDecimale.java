import java.util.Scanner;
import java.lang.Math;

public class ConversioneBinarioDecimale {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        String numeroBinario = ""; // input
        double numeroDecimale = 0; // output

        // variables for the calculation
        double carattere = 0;
        double potenza = 1;
        boolean flagBinario = true;

        System.out.println("Conversione numero binario in numero decimale\n");

        // binary number acquisition
        System.out.println("Inserisci un numero binario: ");
        numeroBinario = tastiera.next();

        // I stay in the loop until I get to the end of the number
        for (int i = numeroBinario.length(); i > 0 && flagBinario; i--) {
            
            carattere = (double)numeroBinario.charAt(i - 1) - 48;

            // Check if the character is 0 or 1
            // If yes then I calculate the number
            if (numeroBinario.charAt(i - 1) == '1' || numeroBinario.charAt(i - 1) == '0') {
                numeroDecimale = numeroDecimale + carattere * potenza;
                potenza = potenza * 2;
            }
            else {
                flagBinario = false;
            }
        }

        // if the number is valid then I print the result
        if (flagBinario)
            System.out.println(numeroDecimale);
        else
            System.out.println("Numero non valido");
    }
}
