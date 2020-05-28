import java.io.*;
import java.util.*;
class UserMainCode
{
 public class isOdd(input1){
      d=input1;
      if(d%2!=0)
      return 2;
      else
      return 1;
     }
    }
  public static void main(String args[])
  {
   int n;
   Scanner in= new Scanner(System.in);
   n=in.nextInt();
   isOdd(n);
   if(n==2)
    System.out.println("Odd");
   else
     System.out.println("Even");
  }
