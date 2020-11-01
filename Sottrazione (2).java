class Sottrazione {
public static void main (String [] args){
/*
SPECIFICA
Dati in ingresso: X intero, Y intero
Dati in uscita: m intero
Condizione di ingresso: X >= Y, Y >= 0
Condizione di uscita: m = X - Y
*/
int X = SavitchIn.readLineInt();
int Y = SavitchIn.readLineInt();
int m = X;
int s = Y; 
while () { // invariante:
	

}  

/*
A questo punto X - Y = m - s per il modo in cui sono
state inizializzate le variabili


while (s > 0) { // supponiamo che a questo punto X - Y = m - s
	 m--;
    s--;
}  

dopo una ulteriore iterazione, abbiamo questi nuovi valori per m ed s:

m' = m - 1
s' = s - 1

m' - s' = (m - 1) - (s - 1) = m - 1 - s + 1 = m - s = X - Y

All'uscita dal ciclo, s = 0, ma allora X - Y = m - s = m - 0 = m,
che dimostra la condizione di uscita.

La correttezza è totale perché vale la terminazione. Per ogni 
coppia X e Y che soddisfa la condizione di ingresso s = Y, e a
ogni iterazione s diminuisce strettamente, cioè s' < s, quindi
dopo un numero finito di decrementi, s = 0 e il ciclo termina.
*/
System.out.println(m);
}

}