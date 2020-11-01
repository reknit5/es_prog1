class Esempio91 {
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

public static void main (String[] args)
{
	int n;
	do //protezione iniziale per evitare che l'utente inserisca un valore negativo.
	   //dopo aver fatto inserire il valore a terminale, finchè questo è minore di 0,
		 //il programma continuerà a chiedere di inserirne un altro > 0.
	 {
		System.out.print("Scrivi un numero intero positivo, seguito da invio: ");
		n = SIn.readLineInt();
	 }
	 while (n <= 0);

	 while (n >= 0)
		{
			System.out.println(n);
			n--; //comando di autocompilamento
		}
/*una volta inserito il valore di n da cui voglio iniziare il conto alla rovescia
inizio il ciclio while. finchè la richiesta interna è vera verrà stampato il valore e
poi ridotto di 1. con n>=0 si arriva fino a -1; invece definendo n>0 si arriva a 0.
*/
 }
}
