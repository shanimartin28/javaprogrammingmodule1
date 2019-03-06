package bestseller.javaprogramming.module1;

import java.util.Random;

/*
 * Program to generates 25 random int values. For each value, use an if-then-else statement to classify it as greater than,
 * less than or equal to a second randomly-generated value.
 * @author: Shani Martin
 */
 
public class Excercise6 {
  /*Method:main*/
  public static void main(String[] args) throws Exception{
   randomGenerator(25);
  }
  
  /*Method:To generate random numbers*/
  private static void randomGenerator(int count) {
    System.out.println("----------------------");
    try{
      Random rand = new Random(); 
      int startValue = rand.nextInt(); 
      for(int i=0;i<25;i++){
        int nextValue = rand.nextInt(); 
        if(startValue<nextValue){
          System.out.println(startValue + " less than " + nextValue);
        }else if(startValue>nextValue){
          System.out.println(startValue + " greater than " + nextValue);
        }else if(startValue==nextValue){
          System.out.println(startValue + " equals to " + nextValue);
        }
        startValue = nextValue;
      }
    }catch(Exception e){
      e.printStackTrace();
    } 
  } 
}



 