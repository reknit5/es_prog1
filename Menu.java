public class Menu
{
  public static void main(String[] args)
  {
    System.out.println("a. New document \nb. Opendocument \nc. Save as ... \nd. Mail document to ...");
    System.out.print("Please, make your choice (a-d): ");
    char sel = SIn.readLineNonwhiteChar();
    if(sel == 'a')
      System.out.println();
      System.out.println("You chose to create a new document.");
    else if(sel == 'b')
      System.out.println();
      System.out.println("Your chose to open a document.");
    else if(sel == 'c')
      System.out.println();
      System.out.println("You chose to save the current document.");
    else if(sel == 'd')
      System.out.println();
      System.out.println("You chose to send current document by email.");
  }
}
