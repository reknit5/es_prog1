class Errore {
/***
Esempi per studiare le varianti delle operazioni booleane, & e |, && (AND) e ||(OR)

operatore di CONGIUNZIONE &, &&: la congiunzione è vera se lo sono entrambe le variabili;
  in questo caso l'operatore && abbrevia la lettura della congiunzione poichè,
  se trova un false come primo membro, dichiara immediatamente false l'operazione.
operatore di DISGIUNZIONE /, //: la Disgiunzione è falsa quando entrambe le variabili sono false;
  anche in questo caso // si ferma al primo valore booleano se trova TRUE, poichè comunque
  la disgiunzione sarebbe vera (operatore lazy).

esempio: 5/0 == 0 && false;
  la valutazione farà uscire fuori un'errore matematico poichè 5/0 non è possibile
  determinarlo.
esempio: false && 5/0 == 0;
  la valutazione in questo caso darà esito FALSE perchè l'operzione si ferma al primo
  membro, per l'operatore &&.
esempio: false && (false & 5/0 == 0);
  risultato: false;
esempio: true && (false && 5/0 == 0);
    risultato: false;
esempio: false // (true // 5/0 == 0);
  risultato: true.


***/
public static void main (String[] args){
System.out.println(false && (true && 5/0 == 0));

/***
Esempio di uso significativo di operatore lazy: dato un array a
while (i < a.length && a[i] < k) {...}
cosa succede quando i = a.lenght? la "i" farà riferimento ad una posizione dell'array "a"
al di fuori di esso, quindi il suo valore booleano sarà FALSO.in questo caso il secondo
operatore darà valore nullo poichè la posizione "i" dell'array "a" non esiste. se si utilizzasse
l'operatore & verrebbero valutati entrambi i membri, dando errore runtime. cosa che non
succederebbe con &&.
***/


}
}
