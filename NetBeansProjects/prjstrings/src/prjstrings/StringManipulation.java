package prjstrings;

public class StringManipulation {

    public static void main(String[] args) {
        
//        String changeCase = "text to change";
//        System.out.println( changeCase );
//        
//        String result;
//        result = changeCase.toUpperCase();
//        
//        System.out.println( result );

//       int result;
//       String Word1 = "Ape";
//       String Word2 = "App";
//       
//       result = Word1.compareTo(Word2);
//       
//       if (result < 0) {
//           System.out.println("Word1 is less than Word2");
//       }
//       else if (result > 0) {
//           System.out.println("Word1 is more than Word2");
//       }
//       else if (result == 0) {
//           System.out.println("The same word");
//       }
//     }
    char ampersand = '@';
    String email_address = "meme@me.com";
    
    int result;
    result = email_address.indexOf( ampersand );
    
    System.out.println( result );
    
  }
