package bestseller.javaprogramming.module1;
/*
 * To create a program that prints values from 1 to 100.
 * @author: Shani Martin
 */
public class Excercise3 {
  public Excercise3() {
  }
  
  public static void main(String[] args) throws Exception{
    printNumbers(1,100);
  }
  
   /*Method:To print the numbers*/
   private static void printNumbers(int startNum, int endNum) {
     for (int i = startNum; i <= endNum; i++) {
       System.out.println(i);
     }
   }
}
