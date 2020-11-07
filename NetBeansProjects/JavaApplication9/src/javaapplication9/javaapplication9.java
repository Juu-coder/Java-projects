package javaapplication9;

import javax.swing.JFrame;
import javax.swing.JLabel;
public class javaapplication9 {
/**
 * 
 * a basic swing with JFrame
 */
     public static void main(String[] args) {
       JFrame frame= new JFrame("Hello Swing");
       //we can initialize the frame with string "Hello Swing",
       //which create a black frame with title "Hello Swing"
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       //the function setDefaultCloseOperation tells the frame what to do
       //when user close the frame and jframe.Exist_ON_CLOSE reforms exit when
       //user close the frame
       JLabel label = new JLabel ("I'm a JLabel", JLabel.CENTER);
       frame.add(label);
       frame.setSize(350, 250);
       frame.setVisible(true);
    }
    
}
