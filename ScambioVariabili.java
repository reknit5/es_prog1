
// Esercizio: Scambio di variabili all'interno del metodo main
// utilizzando delle variabili di supporto

public class ScambioVariabili {

    /* main è il metodo principale, che avvia il programma. 
     * Serve alla macchina virtuale, cioè al comando java per 
     * iniziare l'esecuzione del codice Java 
     * nel file ScambioVariabili.class */
     
    public static void main(String[] args) {
        System.out.println("digita il 1' valore e premi invio: ");
        int a = SIn.readLline();
        System.out.println("digita il 2' valore e premi invio: ");
        int b = SIn.readLine();
        //int x = 3;  // RICORDA: il ';' separa due istruzioni in sequenza
        //int y = 5;
        System.out.println("Prima dello scambio: x = " + a + ", y = " + b);

        // ESERCIZIO: scambia il valore di x con quello di y
        // scrivere qui il codice
        
        int aus = a;
        a = b;
        b = aus;
        
        /***
        int aus = x;
        x = y;
        y = aus;
        ***/
        
        System.out.println("Dopo lo scambio:     x = " + a + ", y = " + b);

    } // fine del main
    
} // fine della classe
