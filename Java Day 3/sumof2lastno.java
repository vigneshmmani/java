import java.util.*;
import java.io.*;
class sumof2lastno
{
  public static int even ()
  {

    Scanner scan = new Scanner (System.in);
    System.out.println ("Enter a number:");
    int N1 = scan.nextInt ();
    System.out.println ("Enter a number:");
    int N2 = scan.nextInt ();
    int rem1 = N1%10;
    int rem2 = N2%10;
   
    return rem1+rem2;
  }
  public static void main (String[]args)
  {
    int s = sumof2lastno.even ();
    System.out.printf ("Output: %d",s);
  }
}
