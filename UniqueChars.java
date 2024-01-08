/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String args[]) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    public static String uniqueChars(String s) {
        
            String newString = "";
            char space = 32;
               for (int i = 0; i < s.length(); i++){    
                     newString = newString + s.charAt(i);              
                   if (newString.indexOf(s.charAt(i)) == - 1 || (s.charAt(i) == space) ){
                     newString = newString + s.charAt(i);
               }
            }
      
                      return newString;
    }
}
