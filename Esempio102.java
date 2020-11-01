/*
Esercizio:
scrivere un programma che determina il massimo tra due numeri naturali,
usando solo le operazioni +1, -1 e confronto con 0.
*/

class Esempio102
{
  public static void main (String [] args)
  {
    System.out.print("Inserisci un numero naturale: ");
      int n = SIn.readLineInt();
    System.out.print("Inserisci un altro numero naturale: ");
      int m = SIn.readLineInt();
      int a = n;
      int b = m;
      int max;

      // si esce dal ciclo quando la condizione è falsa.
      //la condizione si può riscrivere come
      // !(a==0) && !(b==0). per la logica proposizionale
      // questo equivale a !a == 0 // !b == 0, ma essendo
      //le due condizioni già false allora la scrittura è
      // a == 0 || b == 0 (per la legge della doppia negazione).

    while(a != 0 && b != 0)
    {
      a--;
      b--;
    }
 // all'uscita, a == 0 oppure b == 0
  if (a == 0)
    max = m;
  else
    max = n;

  System.out.println("Il massimo e': " + max);
  }
}
/*
i due numeri inziano ad essere diminuiti fino a raggiungere il valore massimo
negativo, per cui si passa subito allo 0 (per la rappresentazione in complemeto a 2),
quindi rappresentazione circolare. si passa dal numero positivo massimo al
numero negativo massimo, fino ad arrivare nuovamente allo 0.
















/*

	int x,y,n,m;
	n = 17;
	m = 3;
	x = n;
	y = m;
	while (y  > 0){
		y--;	// invece di y = y - 1;
		x--;  // invece di x = x- 1;
	}
	if (x >= 0)
		System.out.println(n);
	else
		System.out.println(m);


*/
