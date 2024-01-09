import java.util.Scanner;

public class ModificaVinaio {
    public static void main(String[] args) {
        // Dichiarazione delle costanti
        final double CAPACITA_BOTTIGLIONE = 1.5;  // Bottle capacity in litres
        final double COSTO_AL_LITRO = 1.0;       // Cost per liter of wine
        final double IVA_PERCENTUALE = 21.0;     // IVA percentage

        Scanner scanner = new Scanner(System.in);

        // Ask the user the number of bottles purchased
        System.out.print("Inserisci il numero di bottiglioni acquistati: ");
        int numeroBottiglioni = scanner.nextInt();

        // Calculate the total selling price (cost per liter x liters x number of bottles)
        double prezzoTotale = COSTO_AL_LITRO * CAPACITA_BOTTIGLIONE * numeroBottiglioni;

        // Calculate the IVA applied to the taxable total
        double iva = (prezzoTotale * IVA_PERCENTUALE) / 100;

        // Calculate the total sales price including IVA
        double prezzoTotaleConIva = prezzoTotale + iva;

        // Print the receipt
        System.out.println("Scontrino:");
        System.out.println("Numero di bottiglioni acquistati: " + numeroBottiglioni);
        System.out.println("Prezzo totale di vendita: " + prezzoTotale + " Euro");
        System.out.println("IVA applicata: " + iva + " Euro");
        System.out.println("Prezzo totale comprensivo di IVA: " + prezzoTotaleConIva + " Euro");

        // Close the scanner
        scanner.close();
    }
}
