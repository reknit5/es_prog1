class Esempio4 {

/* 
scambiare i valori di v1 e v2 se v1 > v2
***/
public static void main (String[] args){
int v1 =;   // usare il metodo opportuno di SavitchIn
int v2 = ;  // usare il metodo opportuno di SavitchIn

// blocco per lo scambio dei valori di v1 e v2
{
	int aus;
	aus = v1;
	v1 = v2;
	v2 = aus;
	}	
System.out.println(v1 + "   " + v2);
}

}