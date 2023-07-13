import java.util.*;
import java.io.*;
class oddusingfun
{
  public static int even ()
  {

    Scanner scan = new Scanner (System.in);
      System.out.println ("Enter a number:");
    int N = scan.nextInt ();
    if (N % 2 == 1)
      {
	return 2;

      }
    else
      {
	return 1;

      }

  }
  public static void main (String[]args)
  {
    int s = oddusingfun.even ();
    System.out.printf ("Output: %d",s);
  }
}