class Esempio1
{
/***

Scrivere un programma che dichiara due variabili intere, le inizializza,
scrive i valori su stdout, ne scambia i valori, e riscrive i nuovi valori
su stdout(standard output)

***/
public static void main(String[] args)
  {
    // DICHIARAZIONE ED INIZIALIZZAZIONE
    // println STAMPA SU TERMINALE IL CONTENUTO DELLA PARENTESI
    System.out.print("Scrivi il valore della x: "); // ALL'INTERNO DELLE PARENTESI I CARATTERI VENGONO DETTI STRINGA
    int x = SIn.readLineInt();
    System.out.print("Scrivi il valore della y: "); // println E' DETTO METODO
    int y = SIn.readLineInt();
    System.out.println("il valore della x e' " + x + " ed il valore della y e' " + y + ";");
    int z = x;
    x = y;
    y = z;
    System.out.println("Dopo aver scambiato i valori tra le due variabili ");
    System.out.println("il nuovo valore di x e' " + x + " ed il nuovo valore della y e' " + y + ";");

    // I '+' ALL'INTERNO DELLE PARENTESI TONDE NON SI INTENDONO OPERATORI MATEMATICI,
    // MA COME STRUMENTI PER CONCATENARE LE STRINGE AL SUO INTERNO. SE CI FOSSERO DEI NUMERI
    // QUESTI VERREBBERO SEMPLICEMENTE RAPPRESENTATI A VIDEO E NON CAMCOLATI UNO CON L'ALTRO.
  }
}




/*
public static void main (String[] args){
// dichiarazione ed inizializzazione
System.out.print("Scrivi il valore di x: ");
int x = SavitchIn.readLineInt();
System.out.print("Scrivi il valore di y: ");
int y = SavitchIn.readLineInt();

System.out.println("Prima: x = " + x + ", y = " + y);

// scambio dei valori

int z;
z = x;  // in z abbiamo il valore originale di x
x = y;  // a questo punto x == y
y = z;  // a questo punto y == z (che era il valore di x all'inizio)

System.out.println("Dopo: x = " + x + ", y = " + y);
}
}
*/
