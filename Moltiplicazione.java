/**
Dati in ingresso: interi u >=0, v >=0
Dati in uscita: intero m >= 0
Condizione di ingresso: true
Condizione di uscita: m = u * v
*/
class Moltiplicazione {
public static void main (String [] x){
int u = 9;
int v = 7;
int b = v;
int m = 0;
while (b > 0) {  //invariante: u * v = u * b + m
	 
/**
Supponiamo che la proprietà sia vera dopo la n-esima iterazione, bisogna dimostrare che 
continua ad essere vera dopo la (n+1)-esima iterazione.
Se u * v = u * b + m, una ulteriore iterazione del ciclo ci porta alla seguente situazione:
	u' = u
	m' = m + u
	b' = b - 1
e quindi: 
	u' * b' + m' 	= u * (b - 1) + (m + u)
				= (u * b) - u + (m + u)
				= (u * b) - u + u + m
				= u * b + m
				= u * v
quindi la proprietà è invariante perché è vera anche dopo la 0-esima iterazione, cioè all'inizio:
infatti inizialmente u * v = u * b + 0 = u * v + m.

All'uscita dal ciclo, b = 0 e per l'invariante u * v = m, che 
dimostra la correttezza parziale del programma.

La terminazione (quindi la correttezza totale) segue dal fatto
che b >= 0.
*/
	m = m + u;
	b = b - 1;
}
System.out.println("Il prodotto di " + u + " e " + v + " è " + m);
}
}

