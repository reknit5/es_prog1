public class Ordine
{
    public static void main(String[] args)
    {
        int v1 = 9;
        int v2 = 5; 
        int v3 = 1;
        int aus;
        System.out.println("i valori delle 3 variabili sono: v1 = " + v1 + "; v2 = " + v2 + "; v3 = " + v3 + ";");
        if(v1 > v2)
            {
                aus=v1;
                v1=v2;
                v2=aus;
            }
        if(v2 > v3)
            {
                aus=v2;
                v2=v3;
                v3=aus;
            }
        if(v1>v2)
            {
                aus=v2;
                v2=v1;
                v1=aus;
            }
        System.out.println("i valori delle 3 variabili sono: v1 = " + v1 + "; v2 = " + v2 + "; v3 = " + v3 + ";");
    }
}