package bestseller.javaprogramming.module1;

/*
 * Program to create a switch statement that prints a message for each case, and put the switch inside 
 * a for loop that tries each case. Put a break after each case and test it, 
 * then remove the breaks and see what happens.
 * @author: Shani Martin
 */
public class Excercise8 {
  /*Method:main*/
  public static void main(String[] args) throws Exception{
   switchCaseFunction();
  }
  
  /*Method:To generate random numbers*/
  private static void switchCaseFunction() {
    System.out.println("----------------------");
    try{
      for (int i = 0; i <5; i++)         
      {          
        switch(i) {
                case 0:         
                  System.out.println("Welcome to the easy way of making coffee.");
                  break;
                case 1:
                  System.out.println("Take a kettle filled with half cup water and place it on the stove on medium flame");
                  break;
                case 2:
                 System.out.println("After 2 mins, add half cup of milk to the kettle and allow to heat for another 2 mins");
                 break;
                case 3:
                  System.out.println("Now, add sugar and instant coffee powder and stir for above 2 more mins");
                  break;
                case 4:
                  System.out.println("Now you your coffee is ready!!");
                  break;
                default:
                  System.out.println("Welcome to the easy way of making coffee.");
             }
      } 
    }catch(Exception e){
      e.printStackTrace();
    } 
  } 
}
