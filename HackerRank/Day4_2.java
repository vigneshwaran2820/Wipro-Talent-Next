import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
class Result {
public static void fizzBuzz(int n) {
    
    for (int i=1;i<=n;i++)
    {
    if(i%3 ==0 && i%5==0)
    System.out.println("FizzBuzz");
    else if(i%3 ==0 && i%5!=0)
    System.out.println("Fizz");
    else if(i%3 !=0 && i%5==0)
    System.out.println("Buzz");
    else 
    System.out.println(i);

    }
    }
}
