public class SelezioneOperazione
{
    public static void main(String[] args)

    {
      boolean scelta = true;
      do
      {
        System.out.print("Digitare il primo numero intero seguito da invio. ");
            int a = SIn.readLineInt();
        System.out.print("Digitare il secondo numero intero seguito da invio. ");
            int b = SIn.readLineInt();
        System.out.print("Digitare il terzo numero intero seguito da invio. ");
            int c = SIn.readLineInt();

        System.out.println("quale operazione aritmetica si vuole effettuare? ");
        System.out.println("1 - SOMMA; \n2 - MOLTIPLICAZIONE; \n3 - MEDIA. ");
            int s = SIn.readLineInt();
        if(s == 1)
            {
                int somma = a + b + c;
                System.out.print("La somma dei tre numeri e': " + somma);
            }
        else if(s == 2)
            {
                int per = a * b * c;
                System.out.print("La moltiplicazione dei tre numeri e': " + per);
            }
        else if(s == 3)
            {
                double media = (a + b + c)/3.0;
                System.out.print("La media dei tre numeri e': " + media);
            }
        else
        {
          System.out.println("");
          System.out.print("il numero digitato non corrisponde a nessuna");
          System.out.println(" delle scelte possibili.");
        }
        System.out.println("");
        System.out.println("Riprovare?");
        scelta = SIn.readLineBoolean();
        }
        while (scelta == true);

    }
}
