/** String processing exercise 1. */
public class LowerCase {
    public static void main(String args[]) {
      String str = args[0];
      System.out.println(lowerCase(str));
      
    }
    public static String lowerCase( String s){
      String newString = "";
      for(int i = 0; i<=s.length() - 1; i++){
        if(((int) s.charAt(i)) >= 'A' && ((int) s.charAt(i)) <= 'Z' ){
          int character = ((int) s.charAt(i)) + 32;
          char curr =  0; 
           curr += character;
          newString += curr;
          curr = 0;          
          } else {
           newString += s.charAt(i);
      }

    }
             return newString;
    }
  }
