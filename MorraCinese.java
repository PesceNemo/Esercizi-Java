import java.util.Scanner;
public class MorraCinese {

    public static void main(String[] args) {
        Scanner Keyboard=new Scanner(System.in);

        String num1= "";
        String num2= "";

        do {

            ClrScr();

            //Player 1
            do {
                System.out.println("Inserisci x per finire il gioco");
                System.out.println("Giocatore 1 - (a = carta, s = sasso, d = forbici)");
                num1 = Keyboard.nextLine().toLowerCase();

            } while( !num1.equals("a") && !num1.equals("s") && !num1.equals("d") && !num1.equals("x"));

            ClrScr();

            //If Player 1 did not choose to exit (x)
            if(!num1.equals("x")) {
                // playar 2
                do {
                    System.out.println("Inserisci x per finire il gioco");
                    System.out.println("Giocatore 2 - (j = carta, k = sasso, l = forbici)");
                    num2 = Keyboard.nextLine().toLowerCase();
                } while (!num2.equals("j") && !num2.equals("k") && !num2.equals("l") && !num2.equals("x"));


                ClrScr();
                //If Player 2 did not choose to exit (x)
                if (!num2.equals("x")) {
                    //Check your choices and determine the winner
                    if ((num1.equals("a") && num2.equals("j")) || ((num1.equals("s") && num2.equals("k")) || (num1.equals("d") && num2.equals("l")))) {
                        System.out.println("Parità");
                    } else
                    {
                        if ((num1.equals("a") && num2.equals("k")) || (num1.equals("s") && num2.equals("l")) || (num1.equals("d") && num2.equals("j"))) {
                            System.out.println("Ha vinto il giocatore 1");
                        } else
                        {
                            System.out.println("Ha vinto il giocatore 2");
                        //if ((num1.equals("s") && num2.equals("j")) || (num1.equals("d") && num2.equals("k")) || ((num1.equals("a") && num2.equals("l")))) {
                        }
                    }
                }
            }

        } while ( !num1.equals("x") && !num2.equals("x") );

        System.out.println("Gioco finito");

    }
    private static void ClrScr() {
        //Method to clean the console
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
