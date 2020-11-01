class Esempio3 {

/***
utilizzo dell'istruzione condizionale (if).
determinare il massimo tra due interi (valori di due variabili v1 e v2)
scrivendolo su output standard
***/

public static void main (String[] args){
int max;
System.out.print("digitare il valore di v1: ");
int v1 = SIn.readLineInt();
System.out.print("digitare il valore di v2: ");
int v2 = SIn.readLineInt();
// codice per determinare il valore massimo
if (v1 < v2)
max = v2;  // v2 è il valore massimo
else
max = v1; // in questo caso v1 >= v2
System.out.print("Il valore massimo e': " + max);


/***
metodo più primitivo
max = v1;
if(max < x2)
max = v2;
else
System.out.println(max);
***/



}

}
