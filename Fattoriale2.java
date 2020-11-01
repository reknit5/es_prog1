class Fattoriale
{
	public static void main(String[] args)
	{
		int i = 10;
		int x = 0;
		int y = 1;

		while(x < i)  // invariante => (y = x!)
		{
			x = x + 1;
			y = x * y;
		}
		System.out.println("il fattoriale di ? e': ? ");
	}
}
/***
ad ogni ciclo il valore di x diventa x'= x + 1;
invece il valore di y cambia in      y'= x'* y;

x		y
5		5!= 5 * 4! il valore 5! è assegnato a y' --> (x'* y)
4		4!= 4 * 3!
3		3!= 3 * 2!
2		2!= 2 * 1!
1		1!= 1 * 0!
0		0!= 1
l'invariante si considera y = x!
la y è considerata come un valore fattoriale (es. 5!), quindi per avere
l'uguaglianza tra y e x! si deve effettuare l'operazione di fattoriale al valore di
x (es. 5) -->  y = 5! --> se x = 5 si avrà x! = 5! = y

descrizione del ciclo:

x=0		y=1
0+1=1 		1*1=1
1+1=2		2*1=2
2+1=3		3*2=6
3+1=4		4*6=24
4+1=5		5*24=120

da qui si intuisce ancora di più l'associazione y=x!
