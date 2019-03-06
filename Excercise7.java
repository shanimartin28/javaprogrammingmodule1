package bestseller.javaprogramming.module1;

import java.util.Random;

/*
 * Program that uses two nested for loops and the modulus operator (%) to detect and print prime numbers.
 *  To check if an integer (say n) is prime -> checking if it is divisible by any integer from 2 to (n-1)
 * @author: Shani Martin
 */
public class Excercise7 {
  /*Method:main*/
  public static void main(String[] args) throws Exception{
   printPrimeNumbers(2,100);
  }
  
  /*Method:To generate random numbers*/
  private static void printPrimeNumbers(int startCount, int endCount) {
    System.out.println("----------------------");
    try{
    if(startCount>=2){
      for (int i = startCount; i <= endCount; i++)         
      {          
        int checkNumber = i;
        boolean primeNumber = true;
        for(int j=2 ; j<checkNumber;j++){
          if(i%j==0){
            primeNumber = false;
            break;
          }
        }
        if(primeNumber){
          System.out.println("Prime = " + i);
        }
      }  
    }else{
      System.out.println("Start count needs to be above 2");
    }
    }catch(Exception e){
      e.printStackTrace();
    } 
  } 
}
