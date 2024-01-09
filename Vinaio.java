import java.util.Scanner;

public class VenditaVino {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Constants
        double capacitaBottiglione = 1.5;

        // Prezzi al litro
        double prezzoBarbera = 1.5;
        double prezzoLugana = 2.0;
        double prezzoMerlot = 1.0;

        double ivaPercentuale = 0.21;

        // Initialization of variables for cash total
        double totaleCassa = 0.0;

        // Loop for multiple purchases
        while (true) {
            // Choice of type of wine
            System.out.println("Seleziona il tipo di vino da acquistare:");
            System.out.println("1. Barbera (1.5 Euro/Litro)");
            System.out.println("2. Lugana (2.0 Euro/Litro)");
            System.out.println("3. Merlot (1.0 Euro/Litro)");
            System.out.println("4. Chiudi la cassa");

            int scelta = input.nextInt();

            if (scelta == 4) {
                // Close the register and print the total
                System.out.println("\nTotale della cassa: " + totaleCassa + " Euro");
                break;
            }

            // Input del numero di bottiglioni acquistati
            System.out.print("Inserisci il numero di bottiglioni acquistati: ");
            int numeroBottiglioni = input.nextInt();

            // Calculation of the total sales price
            double costoTotale = 0.0;
            switch (scelta) {
                case 1:
                    costoTotale = numeroBottiglioni * capacitaBottiglione * prezzoBarbera;
                    break;
                case 2:
                    costoTotale = numeroBottiglioni * capacitaBottiglione * prezzoLugana;
                    break;
                case 3:
                    costoTotale = numeroBottiglioni * capacitaBottiglione * prezzoMerlot;
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
                    continue; // Return to the beginning of the loop
            }

            // IVA calculation
            double iva = costoTotale * ivaPercentuale;

            // Calculation of the total price including IVA
            double prezzoTotaleConIva = costoTotale + iva;

            // Update the cash total
            totaleCassa += prezzoTotaleConIva;

            // Print the receipt
            System.out.println("\nScontrino:");
            System.out.println("Numero di bottiglioni acquistati: " + numeroBottiglioni);
            System.out.println("Prezzo totale di vendita: " + costoTotale + " Euro");
            System.out.println("IVA applicata (" + (ivaPercentuale * 100) + "%): " + iva + " Euro");
            System.out.println("Prezzo totale comprensivo di IVA: " + prezzoTotaleConIva + " Euro");
        }

        input.close();
    }
}