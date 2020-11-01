/*
Esercizio:
scrivere un programma che determina il massimo tra due numeri naturali,
usando solo le operazioni +1, -1 e confronto con 0.
*/

class Esempio10 {
public static void main (String [] args){
System.out.print("Inserisci un numero naturale: ");
int n = SavitchIn.readLineInt();
System.out.print("Inserisci un altro numero naturale: ");
int m = SavitchIn.readLineInt();
int a = n;
int b = m;
int max;
while(a != 0 && b != 0) { // in generale !(A && B) equivale a !A || !B
	 // la falsità di !(a == 0) && !(b == 0) equivale in logica a: a == 0 || b == 0
   a = a - 1;
   b = b - 1;
	System.out.println(a + "   " + b);
} // all'uscita, a == 0 oppure b == 0
if (a == 0) max = m;
else max = n;
System.out.println("Il massimo è: " + max);
}
}

/*
In alternativa si può scrivere:

	int x,y,n,m;
	n = 17;
	m = 3;
	x = n;
	y = m;
	while (y  > 0){
		y--;	// invece di y = y - 1;
		x--;  // invece di x = x- 1;
	} // a questo punto y == 0
	if (x >= 0) 
		System.out.println(n);
	else
		System.out.println(m);


*/