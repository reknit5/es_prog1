class Fattoriale{

static int fattoriale(int n){
int i = 0;
int f = 1;
while (i < n){
	i++;
	f = f * i;
	}
return f;
}

public static void main(String[] args){
int x = SavitchIn.readLineInt();
System.out.println(fattoriale(x));
}
}