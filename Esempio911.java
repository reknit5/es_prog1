public class Esempio911
{
		public static void main(String[] args)
		{
				int n = 0;
				boolean rileggi = true; //variabile denominata flag(bandierina)
				do
				{
						if(rileggi)
						{
								System.out.print("Scrivi un numero intero positivo, seguito da invio: ");
								n = SIn.readLineInt();
								rileggi = n <= 0; //questa condizione è equivalente a:
																	//if(n <= 0)
																	//rileggi = true;
																	//else
																	//rileggi = false;
							 //essendo però superflua si passa ad una condizione più elegante
							 // e ad un'ottimizzazione del codice.
						}
						if(!rileggi)
								System.out.println(n);
								n--;
				}
				while (rileggi || n >= 0);
		}
}
/***
questa versione del programma è diversa, anche se fa la medesima cosa.
il ciclo do-while si prende in carico la verifica del valore introdotto dall'utente.
i due if verificano il valore booleano di rileggi (vero o falso). inizialmente n = 0
e rileggi true servono per entrare all'interno del ciclo. se il valore inserito dall'utente
 è "n <= 0"  allora, il controllo che viene effetuato su "rileggi = n <= 0", darà la condizione di
ripetizione del while, perchè rileggi è effettivamente <= 0 e quindi di valore booleano
true (VERO). nel momento in cui si inserisce un valore di n > 0 allore a quel punto
il valore di rileggi <= 0 divento false (FALSO), e si passa al condizionale in cui
rileggi e falsa (!rileggi), avviando il conto alla rovescia finchè, diminuendo n ad
ogni ciclo, n < 0.
***/
