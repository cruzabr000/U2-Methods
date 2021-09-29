import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class FeetToMeters {

    /* Create a program with two buttons. Clicking on the first button will prompt the user to enter a distance in feet and
    convert it to meters. Clicking on the second button will prompt the user to enter a distance in meters and convert to feet.
     */

    public static void main(String[] args) {
        JFrame window = new JFrame("three quotes");
        JPanel panel = new JPanel();
        JButton feetToMeters = new JButton("Click toConvert Feet to Meters");
        JButton metersToFeet = new JButton("Click toConvert Meters to Feet") ;

        window.setSize(300, 100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        panel.add(panel);
        window.setVisible(true);
    }

}
