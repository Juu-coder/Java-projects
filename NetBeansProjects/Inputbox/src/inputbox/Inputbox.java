
package inputbox;
import javax.swing.JOptionPane;

public class Inputbox {

    
    public static void main(String[] args) {
       String first_name;
       first_name = JOptionPane.showInputDialog("Please enter your name");
       
       String family_name;
       family_name = JOptionPane.showInputDialog("Please enter your family name");
       
       String full_name;
       full_name = first_name+family_name;
       
       JOptionPane.showMessageDialog(null, "Your name is  " + full_name );
       System.exit(0);
    }
    
}
