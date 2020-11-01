class Somma{
    /*
Dati in ingresso: M, N interi
Dati in uscita: i intero
Condizione di ingresso: M, N ≥ 0
Condizione di uscita: i = M + N
    */
public static void main (String[] args){
	int M = SavitchIn.readLineInt();
	int N = SavitchIn.readLineInt();
	int i = M; // per non distruggere gli input
	int j = N;  // inizialmente i + j == M + N
	while (j > 0)   { // invariante: i + j == M + N
		 /*** 
		 un invariante (di un ciclo) è una proprietà che è vera dopo un numero arbitrario 
		 n >= 0 di iterazioni del ciclo
	    ***/
		i++;
		j--;
	}  // all'uscita, j == 0, quindi M + N == i + j = i + 0 = i
	
/***
Dimostrazione, per induzione sul numero di iterazioni del ciclo, del fatto che la proprietà: 
	i + j = M + N 
è invariante, cioè: 
	per ogni k >= 0 (dopo k iterazioni del ciclo, M + N = i + j), 
	dove la proposizione (dopo k iterazioni del ciclo, M + N = i + j) è P(k).
	
Base: la proprietà è vera dopo 0 iterazioni, cioè è vera inizialmente, che è immediatamente verificato 
	perché i = M, j = N.
Passo induttivo: sia n un naturale arbitrario, assumiamo (ipotesi induttiva) che la proprietà i+j = M+N sia 
	vera dopo n iterazioni. Bisogna dimostrare che la proprietà i+j = M+N è vera dopo n+1 iterazioni.
	Alla n+1-esima iterazione, i valori di i e j vengono modificati ottenendo

	i' = i + 1
	j' = j - 1

	Allora 
	
	i' + j' = (i+1) + (j-1) 
		= i+1+j-1 
		= i + j 	(per ipotesi induttiva)
		= M+N 
*/
	System.out.println("La somma di M ed N è: " + i);
/*
Correttezza parziale: se il programma termina, questo accade perché la condizione j > 0 è diventata falsa. 
	Quindi all'uscita dal ciclo j = 0, e per l'invariante M + N = i + j = i + 0 = i.
Terminazione: Per il teorema di terminazione (dimostrato in aula e riportato qui sotto), basta trovare 
	una funzione che ad ogni coppia di valori (i,j) associa un numero naturale in modo tale che nel passaggio tra (i,j) e (i+1,j-1) il valore della funzione decresca strettamente.
	La funzione desiderata è f: (i,j) |--> j.
Correttezza totale: segue dalla correttezza parziale e dalla terminazione.
*/
}
}
/*
TEOREMA DI TERMINAZIONE: sia dato un insieme C (di "configurazioni") ed una relazione binaria su C 
(di "transizione") -->.  Assumiamo che si possa trovare una funzione f definita su C a valori nei numeri 
naturali tale che, per configurazioni arbitrarie c,c':

		se c --> c' allora f(c) > f(c').

Allora non esistono sequenze infinite di configurazioni c(0),c(1),c(2),...,c(n),c(n+1),... tali che 

		c(0) --> c(1) --> c(2) --> ... --> c(n) --> c(n+1) --> ...

La dimostrazione (per assurdo) utilizza il fatto che se ci fosse tale sequenza infinita di configurazioni, 
la sequenza risultante di numeri naturali

		f(c(0)) > f(c(1)) > f(c(2)) > ... > f(c(n)) > f(c(n+1)) > ...

sarebbe infinita e strettamente decrescente, impossibile per il Principio del Minimo.

OSSERVAZIONE: Nel caso in cui C sia l'insieme delle configurazioni di memoria di un programma e --> 
rappresenti la trasformazione effettuata dall'esecuzione di una istruzione (per esempio il corpo di 
un ciclo while), allora il teorema afferma che l'esecuzione del programma termina. 
Per esempio, nel caso del programma che siamo esaminando per la somma di due numeri naturali, 
le configurazioni di memoria del programma sono completamente descritte da una coppia di valori 
naturali (i,j), gli unici modificati dal programma ad ogni iterazione del ciclo while. 
In questo esempio abbiamo che (i,j) --> (i',j') precisamente quando i' = i+1 e j' = j-1. 
*/
/*
Esercizio: scrivere un programma che, per dati in ingresso M ed N numeri naturali, calcola 
(come valore di una variabile m) il valore della moltiplicazione di M per N. 
Scrivere la specifica del problema e la dimostrazione di correttezza totale. 
(Il valore del prodotto dovrebbe essere calcolato come iterazione della somma.)
***/
