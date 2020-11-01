public class ScelteInteri
{
    public static void main(String[] args)
    {
        boolean anc = true;
        do
        {
        System.out.print("Digitare un numero intero. ");
        int num = SIn.readLineInt();
        if(num % 2 == 0)
          {
            System.out.println("il numero e' PARI. ");
            if(num % 4 == 0)
            System.out.println("il numero e' multiplo di 4. ");
            else
            System.out.println("il numero non e' multiplo di 4. ");
          }
        else
          {
            System.out.println("il numero digitato e' DISPARI! ");
            if(num % 3 == 0)
            System.out.println("il numero e' multiplo di 3. ");
            else
            System.out.println("il numero non e' multiplo di 3. ");
          }
        System.out.println("vuoi digitare un altro numero? ");
        anc = SIn.readLineBoolean();
        }
        while(anc == true);
    }
}
