import java.util.Scanner;

public class Main
{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Rompi l'uovo e mettilo nella padella.");
        System.out.print("Partire con il timer?");
        String Scelta = scanner.nextLine();

       if (!Scelta.equals("No")) {
            long startTime = System.currentTimeMillis();
            long duration = 3 * 60 * 1000;  // 3 minutes in milliseconds

            while (System.currentTimeMillis() - startTime < duration) {//egg drawing
                for (int i = 0; i < 100; i++) {
                    System.out.println("\n    ______    \n   (      )   \n (          ) \n( /)  /)  /) )\n(/  )/  )/  ))\n (          ) \n   (______)   "); 
                    Wait();
                }
            }
            System.out.println("Il tempo è scaduto. Fine del programma.");
        } else {
            System.out.println("Programma terminato senza avviare il timer.");
        }
    }
    private static void Wait (){//Every second the egg comes out to show that it is cooking
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
