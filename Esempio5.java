/***
determinare il massimo di tre interi (valori di tre variabili v1,v2,v3) scrivendolo su output
***/
class Esempio5
{
public static void main (String[] args)
	{
    System.out.print("Scrivi il primo valore: a = ");
		int a = SIn.readLineInt();
		System.out.println();
		System.out.print("Scrivi il secondo valore: b = ");
		int b = SIn.readLineInt();
		System.out.println();
		System.out.print("Scrivi il terzo valore: c = ");
		int c = SIn.readLineInt();
		int max;
// metodo: String è un metodo e definisce un array di stringhe.
// il parametro args è una variabile che è possibile sostituita con qualsiasi altra.
		if (a < b) // il valore di a è minore di b.

			if (b < c) // il valore di b è minore di c, quindi c >= b > a
				max = c;

			else // il valore di b è maggiore di c, quindi a < b e b >= c.
			 	max = b;
		else // il valore di a è maggiore di b
			if (a < c) // il valore di a è minore di c, quindi c è max.
				max = c;
			else // il valore di c < di a, allora a è >= di c.
				max = a;

		System.out.println("il massimo tra i tre valori e': " + max);
		//System.out.println(max);
	}
}

/*
if (a > b & a > c)
	max = a;
else
if (b > a | b > c)
	max = b;
else
	max = c;
*/
