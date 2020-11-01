class Pompieri {

public static void main (String [] args){
	System.out.print("Quanti pompieri? (almeno 2): ");
	int p = SavitchIn.readLineInt();
	System.out.println(1 + " pompiere + 1 pompiere = " + 2 + " pompieri");
	int n = 2;
	while (n < p) {
		System.out.println(n + " pompieri + 1 pompiere = " + (n+1) + " pompieri");
	n++;
	}
}
}
