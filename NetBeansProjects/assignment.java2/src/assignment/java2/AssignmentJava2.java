
package assignment.java2;
import javax.swing.JOptionPane;

public class AssignmentJava2 {

    
    
    public static void main(String[] args) {
    String radius = JOptionPane.showInputDialog("Please enter radius");
    double rad = Double.parseDouble(radius);
    double pi = 3.1423;
    double Area = rad * rad * pi;
    
    JOptionPane.showConfirmDialog(null, "The radius of the circle : = " +Area,"Area of a Circle Calculation",JOptionPane.PLAIN_MESSAGE );
       
    }
    
}
