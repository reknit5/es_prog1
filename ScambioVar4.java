public class ScambioVar4
{
    public static void main(String[] args) 
    {
    int v1=1;
    int v2=2;
    int v3=3;
    int v4=4;
    
    System.out.println("i valori delle 4 variabili sono: " + v1 +" "+ v2 +" "+ v3 +" "+ v4);
    int aus = v1;
    v1 = v2;
    v2 = v3;
    v3 = v4;
    v4 = aus;
    System.out.println("i nuovi valori delle 4 variabili sono: " + v1 +" "+ v2 +" "+ v3 +" "+ v4);
}
}