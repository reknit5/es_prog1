class Esempio9 {
/***** ESERCIZIO

Sviluppare un programma che:
- chiede all'utente di inserire da tastiera un numero intero positivo.
- visualizza a video il conto alla rovescia, fino a 0, partendo dal numero inserito.

Questa versione usa un solo ciclo do-while, sfruttando il fatto che:

- o n <= 0, e allora bisogna rileggerlo (variabile rileggi == true);
- o n > 0, e allora inizia il conteggio alla rovescia senza rileggere un 
  altro numero (variabile rileggi == false).

Inizialmente rileggi == true (il numero non e' ancora stato  letto)
*****/

public static void main (String[] args){
int n = 0;
boolean rileggi = true;
do {
if (rileggi) {
	 System.out.print("Scrivi un intero positivo, seguito da invio: ");
    n = SavitchIn.readLineInt();
    rileggi = n <= 0;
}
if (!rileggi) 
	if (n >= 0) {
	System.out.println(n);
   n--;   // equivale a n = n - 1;
   } 
} while (rileggi || n >= 0);
}
}

/***
Questa versione e' quella che abbiamo visto durante la lezione, con due cicli:

do {
System.out.print("Scrivi un intero positivo, seguito da invio: ");
n = SavitchIn.readLineInt();
} while (n <= 0);
while (n >= 0) {
	System.out.println(n);
   n--;   // equivale a n = n - 1;
}  // a questo punto n == -1
***/
