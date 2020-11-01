class Esempio7 {
/*
date tre variabili intere v1,v2,v3, scambiarne i valori in modo tale che alla fine v1 <= v2 <= v3

ESEMPIO:

v1	v2	v3		   v1	v2	v3		   v1	v2	v3
5	  3	  1 	-->  3	5 	1	-->	   3	1	  5
^					          ^					          ^

è necessaria una ulteriore serie di confronti:

v1	v2	v3		   v1	v2	v3
3	  1	  5	-->	   1	3	  5
^					          ^

non è più necessario confrontare v1, v2 e v3 perché v3, dopo la prima serie di confronti, contiene
il valore massimo.

***/
public static void main(String[] args)
{
  System.out.print("");
  System.out.print("Scrivi il primo valore: v1 = ");
  int v1 = SIn.readLineInt();
  System.out.print("Scrivi il primo valore: v2 = ");
  int v2 = SIn.readLineInt();
  System.out.print("Scrivi il primo valore: v3 = ");
  int v3 = SIn.readLineInt();
  int aus;

if (v1 > v2)
  {
   aus = v1;
   v1 = v2;
   v2 = aus;
	} // ora v1 <= v2

if (v2 > v3)
  {
   aus = v2;
   v2 = v3;
   v3 = aus;
  } // ora v2 <= v3, e (v1, v2) <= v3

if (v1 > v2)
  {
   aus = v1;
   v1 = v2;
   v2 = aus;
	} // ora v1 <= v2 <= v3

System.out.println("v1 = " + v1 + " v2 = " + v2 + " v3 = " + v3);

}
}
