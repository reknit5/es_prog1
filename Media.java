/**
Scrivere un programma che legge da stdin una sequenza di interi positivi
terminata da 0 e ne scrive su stdout la media
*/

class Media
{
    public static void main (String[] args)
    {
        // dichiarazioni di variabili
        double n = 0.0;
        int s;
        int somma = 0;
        double media;
        boolean v = true;
        do
            {
                System.out.println("scrivi un numero intero positivo: ");
                s = SIn.readLineInt();
                somma = somma + s;
                n++;
                System.out.println("vuoi aggiungere ancora un valore? si: t; no: f.");
                boolean scelta = SIn.readLineBoolean();
                if (scelta == true)
                v = true;
                else
                v = false;
            } while (v == true);
            media = somma/n;
            System.out.println("Media =  " + media);
    }
}
