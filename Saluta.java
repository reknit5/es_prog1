public class Saluta
{
  public static void main(String[] args)
  {
    system.out.print("Mi dici che ore sono?");
    double ora = SIn.readLineDouble();
    if(ora => 6.00 || ora <= 11.59)
        System.out.print("Buongiorno!");
    if(ora >= 12.00 || ora <= 17.59)
        System.out.print("Buon Pomeriggio!");
    if(ora >= 18.00 || ora < 20.59)
        System.out.print("Buona Sera!");
    if(ora >= 21.00 || ora <= 5.59)
        System.out.print("Buona notte")
  }
}
