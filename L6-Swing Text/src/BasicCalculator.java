import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BasicCalculator {

    /* Create a calculator program with two text fields
    and 4 buttons, one for each of the arithmetic operations.

    The user will enter numbers, could be decimals, then click
    on one of the buttons and the answer will display on the calculator.

    NO POP-UPS
     */
    static JTextField InputField1, InputField2;
    static JLabel resultLabel;

    public static void main(String[] args) {
        JFrame window = new JFrame("This Is a Simple window");
        JPanel panel = new JPanel();
        JLabel inputLabel1 = new JLabel("Enter a number: ");
        JLabel inputLabel2 = new JLabel("Enter a number: ");
        JTextField inputField1 = new JTextField(10);
        JTextField inputField2 = new JTextField(10);

        JButton addBut = new JButton("button");
        JButton subtraction = new JButton("subtractio");
        JButton multBut = new JButton("multBut");
        JButton divBut = new JButton("divBut");
        JLabel resultLabel = new JLabel("0.00");

        window.setSize(200, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);


        panel.add(InputField1);
        panel.add(InputField1);
        panel.add(InputField2);
        panel.add(InputField2);

        panel.add(resultLabel);

        panel.add(subtraction);
        panel.add(addBut);
        panel.add(multBut);
        panel.add(divBut);

        panel.add(panel);
        window.setVisible(true);


    }



        public void actionPreformed(ActionEvent actionEvent) {
            double number1 = Double.parseDouble(InputField1.getText());
            double number2 = Double.parseDouble(InputField2.getText());

            resultLabel.setText(String.valueOf(number1 + number2));
        }

}