/***
class Esempi {
public static void main (String[] args){
   int x = 12;
   int y = 20;
   int z;
   z = x + y;
   System.out.println(z);    // Quale valore viene stampato su output?
   }
}

class Esempi {
public static void main (String[] args){
   int x = 12;
   int y = 20;
   int z;
   z = x + y;
   z = z - x;
   System.out.println(z);    // Quale valore viene stampato su output?
   }
}

class Esempi {
public static void main (String[] args){
   int x = 12;
   int y = 20;
   int z;
   z = x + y;
   z = z - y;
   System.out.println(z);    // Quale valore viene stampato su output?
   }
}
***/
class Esempi {
public static void main (String[] args){
   int x = 12;
   int y = 20;
   int z;
   z = x + y;  // == 32
   z = z + (z - x);  // == 52
   System.out.println(z);    // Quale valore viene stampato su output? 
   }
}
