package bestseller.javaprogramming.module1;

/*
 * Program to write a function that takes two String arguments, and 
 * uses all the boolean comparisons to compare the two Strings and print the results. 
 * For the == and !=, also perform the equals( ) test. 
 * In main( ), call your function with some different String objects.
 * @author: Shani Martin
 */


public class Excercise5 {
  /*Method:main*/
  public static void main(String[] args) throws Exception{
   String s1 = new String("HELLO"); 
   String s2 = new String("HELLO"); 
   compareStringArguments(s1,s2);
   compareStringArguments(new String("HELLO1"),new String("HELLO2"));
   
  }
  
  /*Method:To compare two string arguments*/
  private static void compareStringArguments(String arg1, String arg2) {
    System.out.println("----------------------");
    System.out.println("Strings compared are : " + arg1 + ", " + arg2 + "");
    try{
      System.out.println("Using == operator : ");
      System.out.println(arg1 == arg2); 
      System.out.println("Using equals operator : ");
      System.out.println(arg1.equals(arg2)); 
      System.out.println("Using != operator : ");
      System.out.println(arg1 != arg2); 
      System.out.println("Using equalsIgnoreCase operator : ");
      System.out.println(arg1.equalsIgnoreCase(arg2)); 
    }catch(Exception e){
      e.printStackTrace();
    } 
  } 
}
