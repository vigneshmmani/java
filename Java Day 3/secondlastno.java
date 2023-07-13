import java.util.*;
import java.io.*;
class secondlastno
{
  public static int even ()
  {

    Scanner scan = new Scanner (System.in);
      System.out.println ("Enter a number:");
    int N = scan.nextInt ();
    int rem = N%10;
    int r = ((N%100)-rem)/10;
    return r;
  }
  public static void main (String[]args)
  {
    int s = secondlastno.even ();
    System.out.printf ("Output: %d",s);
  }
}
