public class Ripetitesto
{
    public static void main(String[] args)
    {
        System.out.println("Scrivere una qualunque frase.");
        //string frase = SIn.readLineString();
        String frase = "ciao bello come stai?";
        
        for(int a=5; a>0; a--)
        {
                System.out.println(frase);
        }
        
        System.out.println("la stringa e' lunga " + frase.length() + " caratteri.");
    }
}