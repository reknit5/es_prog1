public class Spesa
{
    public static void main(String[] args)
    {
       double orecchiette = 1.50;
       double pomodori = 2.50;
       double totale;
       System.out.println("quanti pacchi di orecchiette hai preso?");
       int pacchi = SIn.readLineInt();
       System.out.println("quanti kg di pomodori hai preso?");
       double kg = SIn.readLineDouble();
       totale = pacchi * orecchiette + kg * pomodori;
       //totale = orecchiette * 3 + pomodori * 1.5;
       System.out.println("In tutto hai speso: " + (int)totale + " euro " + (totale - (int)totale) + " centesimi");
    }
}
