// DIVISIONE INTERI

class DivisioneInteri
{
  /***
  DATI IN INGRESSO: INTERI X,D con X numeratore >= 0 e D denominatore > 0.
  DATI IN USCITA: interi q,r con q QUOZIENTE e r RESTO della divisione.
  CONDIZIONE DI USCITA: X = q * D + r && r < D
  ***/
  public static void main(String[] args)
  {
    int X=14;
    int D=3;
    int q=0;
    int r=X;
    /**
    X = r perchè all'inizio del ciclo, q è ancora uguale a zero, mentre il
    resto assume il valore di valore massimo.
    come per il conteggio alle elementari, cerco di capire quante volte D sta in X
    aumentando il quoziente.

    a zero cicli il valore di x è:  (14 = 0*3 + 14 | vero)
    14 - 3 = 11 ; q = 1   r = 11    (14 = 1*3 + 11 | vero)
    11 - 3 = 8  ; q = 2   r = 8     (14 = 2*3 + 8  | vero)
    8 - 3 = 5   ; q = 3   r = 5     (14 = 3*3 + 5  | vero)
    5 - 3 = 2   ; q = 4   r = 2     da questo momento il resto è minore del denominatore
                                    e il ciclo while termina.
    **/

    while(r>=D) // invariante di ciclo?  [X = q * D + r]
      {
        q = q + 1;
        r = r - D;
      }

    System.out.println(q + " " + r);
  }
}

/***
correttezza:
il variante deve vale per ogni numero arbitrario di ciclo di iterazione.
se prima vale X = q * D + r, deve valere anche dopo l'iterazione.

q'= q + 1
r'= r - D

q'*D + r' = (q + 1) * D + (r - D)
          = q*D + D + r - D
          = q*D + r
          = X
