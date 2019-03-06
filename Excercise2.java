package bestseller.javaprogramming.module1;
/*
 * To create a program that prints three arguments taken from an array of Strings.
 * @author: Shani Martin
 */
public class Excercise2 {
  
  /*Method:main*/
  public static void main(String[] args){
    String[] strArray = { "one", "two", "three" };
    int count = printThreeArguments(strArray);
    System.out.println("Total count of strings : " +count);
  }
 
  /*Method:To print the three arguments*/
  private static int printThreeArguments(String[] args) {
    int i = 0;
    for (i = 0; i < args.length; i++) {
      boolean valid = isValid(args[i]);
      if(valid){
        System.out.println(args[i]); 
      }else{
        System.err.println("Ignoring invalid argument " + args[i]);
      }
    }
    return i;
  }
  
  /*Method:To handle exceptions*/
  private static boolean isValid(String argument){
    try{
      String strValue = String.valueOf(argument);
      if(strValue!=null)
        return true;
    }catch(Exception e){
      e.printStackTrace();
    } 
    return false;
  }
}
