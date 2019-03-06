package bestseller.javaprogramming.module1;

/*
 * To modify Exercise 3 so that the program exits by using the break keyword at value 47. Try using return instead.
 * @author: Shani Martin
 */
public class Excercise4 {
 
  public static void main(String[] args) throws Exception{
    int count = printNumbers(1,100);
    System.out.println("Print succeeded till count : " + count);
  }
  
    /*Method:To print the numbers*/
   private static int printNumbers(int startNum, int endNum) {
     int i;
     for (i = startNum; i <= endNum; i++) {
       System.out.println(i);
       if(i==47)
        break;
     }
     return i;
   }
}
