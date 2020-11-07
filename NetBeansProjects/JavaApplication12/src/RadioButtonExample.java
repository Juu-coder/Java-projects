import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/*
 *A basic swing example with JFrame
 */
public class RadioButtonExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Swing");
        JPanel panel = new JPanel();
        
        //create radio buttons
        ButtonGroup bg = new ButtonGroup();
        JRadioButton rb1 = new JRadioButton("Male",true);
        JRadioButton rb2 = new JRadioButton("Female", false);
        JRadioButton rb3 = new JRadioButton("Not specified", false);
        
        //add the radio buttons to the button group
        bg.add(rb1);
       bg.add(rb2);
       bg.add(rb3);
       
       //add to the panel and frame
       panel.add(rb1);
       panel.add(rb2);
       panel.add(rb3);
       frame.add(panel);
       frame.pack();
       
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       frame.setVisible(true);
       }
    
}
