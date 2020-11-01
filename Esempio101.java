/*
Esercizio:
scrivere un programma che determina il massimo tra due numeri naturali,
usando solo le operazioni +1, -1 e confronto con 0.
*/

class Esempio101
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

    while(a > 0)
    {
      a--;
      b--;
    }
 // all'uscita, a == 0 oppure b == 0
  if (b > 0)
    max = m;
  else
    max = n;

  System.out.println("Il massimo e': " + max);
  }
}
















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
