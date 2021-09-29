import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Quotes {

    /*Create a GUI program with three buttons.
    Each button displays one of your favorite quotes.
    Hint: Use \n to make a new line.
     */
    public static void main(String[] args) {
        JFrame window = new JFrame("This Is a Simple window");
        JPanel panel = new JPanel();
        JButton button = new JButton("Quote1");
        JButton button2 = new JButton("Quote2");
        JButton button3 = new JButton("Quote3");


        window.setSize(300, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setLocationRelativeTo(null);

        button.addActionListener(new ButtonListener());

        button2.addActionListener(new ButtonListener2());

        button3.addActionListener(new ButtonListener3());

        panel.add(button2);
        panel.add(button3);
        panel.add(button);
        window.add(panel);

        window.setVisible(true);


    }

    private static class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            JOptionPane.showInputDialog(null, "\"Folks are usually about as happy as they make their minds up to be\"\n-Abraham Lincon");
        }
    }
    private static class ButtonListener2 implements ActionListener {

        public void actionPerformed(ActionEvent e)
        {
            JOptionPane.showInputDialog(null, "\"Do I not destroy my enemies when I make them my friends\"\n-Abraham Lincon");
        }
    }
    private static class ButtonListener3 implements ActionListener {

        public void actionPerformed(ActionEvent e)
        {
            JOptionPane.showInputDialog(null, "\"My Best Friend is a person who will give me a book I have not read\"\n-Abraham Lincon");
        }
    }
}