import java.util.*;
import java.io.*;
class lastno
{
  public static int even ()
  {

    Scanner scan = new Scanner (System.in);
      System.out.println ("Enter a number:");
    int N = scan.nextInt ();
    int rem = N%10;
    return rem;
  }
  public static void main (String[]args)
  {
    int s = lastno.even ();
    System.out.printf ("Output: %d",s);
  }
}
