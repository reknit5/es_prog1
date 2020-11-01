class Auto {
public static void main(String[] args){
/***
Indovinare cosa viene stampato su stdin a ciascuna riga
***/
int x = 0;
System.out.println(x++); // 0
System.out.println(x); // 1
System.out.println(++x); // 2
System.out.println(x);  // 2
System.out.println(x--); // 2
System.out.println(x);  // 1
System.out.println(--x);  // 0
System.out.println(x);  // 0
System.out.println(x++ + x--);  // 1
System.out.println(x); // 0

}


}