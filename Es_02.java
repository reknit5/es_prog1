int x = 4;
int y = -1;

  if(x >= 4); // SI!
    x = x+1;  // X = 5
  else
    System.out.println(x);

System.out.println(x-y); // 6

  if(y >= 1) // SI!
    System.out.println(x+y); // 5
  else
    System.out.println(x);

// IL RISULTATO FINALE E' 65
