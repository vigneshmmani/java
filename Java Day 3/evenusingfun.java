import java.util.*;
import java.io.*;
class evenusingfun
{
  public static int even ()
  {

    Scanner scan = new Scanner (System.in);
      System.out.println ("Enter a number:");
    int N = scan.nextInt ();
    if (N % 2 == 0)
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
    int s = evenusingfun.even ();
    System.out.printf ("Output: %d",s);
  }
}