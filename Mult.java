class Mult {

public static int somma (int a, int b){
while (b > 0){
	a++;
	b--;
}
return a;
}

public static void main (String[] args){
int x = SavitchIn.readLineInt();
int y = SavitchIn.readLineInt();
int m = 0;
while (y > 0){
	 // Esercizio: scrivere il prodotto di x e y NON usando il metodo per la somma
	m = somma(m,x);
	y--;
}
System.out.println(m);
}
}
