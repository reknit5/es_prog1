public class Pompieri1
{
    public static void main(String[] args)
    {
        System.out.print("scrivere quanti pompieri si vuole contare (min: 2):");
        int n = SIn.readLineInt();
        int a = 1;
        while(a != n)
        {
            if(a==1)
              System.out.println("1 pompiere + 1 pompiere = 2 pompieri.");
            a++;
            System.out.println(a + " pompieri + 1 pompiere = " + (a + 1) +  " pompieri.");
        }
    }
}
