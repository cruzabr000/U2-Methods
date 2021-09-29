import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimpleFrame
{

    public static void main(String[] args)
    {
    JFrame window = new JFrame("This Is a Simple window");
    JPanel panel = new JPanel();
    JButton button = new JButton("do not press");

    window.setSize(800, 600);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    window.setLocationRelativeTo(null);

    button.addActionListener(new ButtonListener());

    panel.add(button);
    window.add(panel);


    window.setVisible(true);
    }
    private static class ButtonListener implements ActionListener{

        public void actionPerformed(ActionEvent e){
            JOptionPane.showInputDialog(null, "The button was clicked!");
        }
    }
}
