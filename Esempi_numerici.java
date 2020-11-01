class Esempi_numerici {
public static void main (String[] args)
{
/***********************************************************
Riepilogo:
Integer:
– decimali (base 10): numero
– ottale (base 8): 0numero
– esadecimale (base 16): 0xnumero
  Esempi
– Decimale int: 10
– Decimale long:10L raddoppia lo spazio in memoria. esempio passando da 32bit a 64bit.
– Ottale int: 010
– Esadecimale int: 0x10

Float: Composto da
– Parte numero intero
– Punto decimale (.)
– Parte frazionaria
– Esponente: E oppure e seguito da un intero con segno
– Suffisso
 F oppure f float
 D oppure d double (default)
 Esempi
– Double: 1e1, 2., .3, 0.0, 3.14
– Float: 1e1f, 2.f, .3f, 0f, 3.14f
************************************************************/
/***
int n = 1;
int m = 2;

int a = 022;    // provare a scrivere 022: il numerale viene intepretato in
int b = 0x22;   // ottale. Scrivere anche 0x22, e l'interpretazione è in
                // esadecimale. Provare 0xF.


float x = 15e-3f; //
double y = 2.0e10;
long l = 1000000000000l; la "l" serve al compilatore per determinare in numero come
                             long!


int a;
float b;
a = 015;  // per la rappresentazione posizionale: 8^1 * 1 + 8^0 * 5 = 8 + 5 = 13
a = 0456; // 8^2 * 4 + 8^1 * 5 + 8^0 * 6 = 64 * 4 + 8 * 5 + 1 * 6 = 256 + 40 + 6 = 302
a = 0xa;  // 16^1 * 1 + 16^0 * 0 = 16 + 0 = 16
a = 1000000000000;

byte x; il massimo numero intero rappresentabile è 255, cioè da 0 a 256. con l'aritmetica in complemento a 2
        il minimo numero negativo è 128, mentre "salendo" verso il più grande numero naturale rappresentabile
        il -1 corrisponde a 256.
x = 127;

short x;
x = 32767;
***************************************************************/
// System.out.println(x + "  " + y + "   " + l);
// System.out.println(a);

// System.out.println(a);
// System.out.println(b);
}
}
