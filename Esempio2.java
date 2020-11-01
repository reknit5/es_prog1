class Esempio2 {
/*
scrivere le istruzioni che scambiano il valore di tre variabili v1,v2,v3 
in modo che, v1' = v3, v2' = v1, v3' = v2, dove, per una generica variabile v, 
v' è il nuovo valore di v dopo un blocco di istruzioni specificato
***/
public static void main (String[] args){
int v1, v2, v3;
v1 = 1;
v2 = 2;
v3 = 3;
System.out.println("Prima: v1 = " + v1 + ", v2 = " + v2 + ", v3 = " + v3);
// scambi
int u;
u = v3;
v3 = v2;
v2 = v1;
v1 = u;

System.out.println("Dopo: v1 = " + v1 + ", v2 = " + v2 + ", v3 = " + v3);
/***
In alternativa, senza usare una variabile ausiliaria:
v1 = v1 + v2 + v3;
v2 = v1 - (v2 + v3);  // ora v2 ha il valore iniziale di v1
v3 = v1 - (v2 + v3);  // ora v3 ha il valore iniziale di v2
v1 = v1 - (v2 + v3);  // ora v1 ha il valore iniziale di v3
***/
}

}