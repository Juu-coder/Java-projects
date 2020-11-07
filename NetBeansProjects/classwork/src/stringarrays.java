//package strings1;
//import java. util.Arrays;
//     
//public class stringarrays {
//
//    
    public static void main(String[] args) {
//   
//        String[] arystring = new String[5] ;
//        
//        arystring[0] = "This";
//        arystring[1] = "is";
//        arystring[2] = "a";
//        arystring[3] = "string";
//        arystring[4] = "array";
////        
//          Arrays.sort(aryString);
//          
//          int i;
//          for (i=0; i < aryString.length; i++){
//                  System.out.println( aryString[i] );
//            }
//        }
//    }
//   
   
       
//       char ampersand = '@';
    
       String email_address1 = "meme@me.cob";
//       String dotCom = ".com";
       String email_address2 = "meme@me.com";
    
//       int atPos = email_address.indexOf( ampersand );
//       int result = email_address.indexOf(dotCom, atPos);
//    
//       if (result== -1 ) {
//           System.out.println( "Invalid Email Address");
//
//       }
//       else{
//           System.out.println( "Email Address OK " + result );
//       }
       
//}
//          int result;
//          result = email_address.indexOf( dotCom );
//
//          if (result== -1 ) {
//             System.out.println( "Invalid Email Address" );
//          }
//          else {
//               System.out.println( "Email Address OK");
          }
     }

  Boolean isMatch = false;
    
  isMatch = email_address1.equals(email_address2);

  if (isMatch == true) {
      System.out.println( "Email Address Match ");
  }
else {
     System.out.println("Email addresses don't match");
    }
}