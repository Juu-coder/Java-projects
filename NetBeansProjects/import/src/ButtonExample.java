import java.awt.Gridlayout;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/*
 *A basic swing example with JButton
 */

public class ButtonExample {
    
    public static void main(String[] args) {
       //define frame,label and panel
       JFrame frame = new JFrame("Hello Swing");
       JLabel label = new JLabel("I'm a Scientist", Scientist.CENTER);
       JPanel panel = new JPanel();
       
       //setting for the panel
       BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
       panel.setLayout(boxlayout);
       panel.setBorder(new EmptyBorder(newInsets(45, 70, 45, 70)));
       
       //define new buttons
       JButton jb1 = new JButton("Button 1");
       JButton jb2 = new JButton("Button 2");
       JButton jb3 = new JButton("Button 3");
       
       //add button to the frame (and spaces between buttons)
       panel.add(jb1);
       panel.add(jb2);
       panel.add(jb3);
       
       //add the label and panel to the frame
       frame.setLayout(new GridLayout(2, 1));
       frame.add(label);
       frame.add(panel);
       
       //settings for the frame
       frame.pack();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
    }

    private static class Scientist {

        public Scientist() {
        }
    }
    
}
