class Prova {
public static void main (String[] args){
int a = 1;
int b = 2;
int c = 3;
int max;
if (a > b && a > c) {
			max = a;
		} 
else // a <= b || a <= c perché !(A & B) è !A || !B
if (b > a | b > c) {    // qui c'e' un errore
			max = b;
		} 
else {  // b <= a && b <= c
			max = c;
		}
System.out.println(max);
		
}
}