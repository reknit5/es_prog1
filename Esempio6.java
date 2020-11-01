class Esempio6 {
/***
Letteratura potenziale: vedi Oulipo in Francia.
Calvino, Queneau e altri
***/

public static void main (String[] args){
boolean giallo = true;
boolean in_costume = false;

if (giallo) {
	System.out.print("il bandito ");
    if (in_costume)
    	System.out.print("estraendo la pistola ");
    else
    	System.out.print("in fuga ");
    }
else {
	System.out.print("la ricca ereditiera ");
    if (in_costume)
    	System.out.print("incipriandosi il naso ");
    else
    	System.out.print("sollevando il telefono ");
    }

if (giallo)
	System.out.print("sparò ");
else
    System.out.print("sorrise ");

if (giallo)
	System.out.println("al poliziotto");
else
    System.out.println("alla cameriera");

}
}
