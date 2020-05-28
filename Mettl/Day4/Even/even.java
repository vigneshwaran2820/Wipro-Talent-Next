import java.io.*;
import java.util.*;
class UserMainCode
{
 public class isEven(input1){
      if(input1%2==0)
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
   isEven(n);
   if(n==2)
    System.out.println("Even");
   else
     System.out.println("odd");
  }
