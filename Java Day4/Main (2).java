import java.io.*;
import java.util.*;
class UserMainCode
{
  public int lastDigitOf (int input1)
  {
    if (input1 < 0)
      {
	input1 = (-1) * input1;
      }
    return input1 % 10;



  }
