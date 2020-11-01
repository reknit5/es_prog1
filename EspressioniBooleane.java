/*
Valutare le seguenti espressioni booleane (a mente o su carta)

3>5 || 10 == 7+3                    [vero]                                  ok
3 != 5 && (6 < 2 || 5+2 == 10 - 3)  [vero] ((3!=5) && (6<2 || 5+2 == 10-3)) ok
3 < 5 < 7                           [vero]  si scrive nella stessa forma di quello successivo
3 < 5 && 5 < 7                      [vero]  3<5 && 5<7                      ok
3 < 5 && 7 < 5                      [falso] 3<5 && 7<5                      ok
true && false                       [falso] true && false                   ok
true && 5 < 7                       [vero]  true && 5<7						ok
false || 5 < 10                     [vero]  false || 5<10                   ok


In seguito, completare il codice della classe EspressioniBooleane, 
in modo da valutare in Java le espressioni elencate qui sopra.
Alcune espressioni sono scorrette e causeranno la
generazione di errori di compilazione. Perché e cosa fare per rimediare?
*/
3<5<7 da come errore "bad operand types for binary operator", perchè sto utilizzando
l'operatore booleano di contronto < (operatore binario) con più di 3 termini.

public class EspressioniBooleane {

    public static void main(String[] args) {
        System.out.println("3>5 || 10 == 7+3 is " + (3 > 5 || 10 == 7 + 3));
        
        // completare il codice della classe
    }

}
