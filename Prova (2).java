/***
class Prova {

static void f(int x){
	x = x + 1;
	}

public static void main (String[] args){
	int n = 5;
	f(n);
	System.out.println(n);
	}
}
***/


class Prova {

static int f(int x){
	x = x + 1;
	return x;
	}

public static void main (String[] args){
	int n = 5;
   n = f(n);
	System.out.println(n);
	}
}
