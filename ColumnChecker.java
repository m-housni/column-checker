import java.util.Scanner;
import java.io.*;

class ColumnChecker
{
  public static void main (String[] arg)
  {
    final int colNum = 10;
    int counter = 0;
    String line = null;
    Scanner scan = new Scanner( System.in );
   
    while ( scan.hasNext() )
    {    
      line = scan.nextLine() ;
      counter = counter +1;
      if ( line.length() > colNum && line.charAt( colNum ) != ' ' )
        System.out.println( counter + ":\t" + line );
    }    
  }
}