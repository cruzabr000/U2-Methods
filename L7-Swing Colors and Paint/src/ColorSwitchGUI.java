import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ColorSwitchGUI {

    //Declare your frame, panel and three buttons.
    JFrame window = new JFrame("Color switcher");
    JPanel panel = new JPanel();
    JButton ColorThemeDark = new JButton("Theme; Dark");
    JButton ColorThemeWarren = new JButton("Theme; Warren");
    JButton ColorThemePrimary = new JButton("Theme; Primary");

    public ColorSwitchGUI(){
        //create your GUI



        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 300);
        window.setLocationRelativeTo(null);

        panel.add(ColorThemeDark);
        panel.add(ColorThemeWarren);
        panel.add(ColorThemePrimary);

        window.add(panel);
        window.setVisible(true);

        ColorThemeDark.addActionListener(new ThemeDark());
        ColorThemeDark.addActionListener(new Themewarren());
        ColorThemeDark.addActionListener(new ThemePrimary());

    }

    //add listeners to change the colors. Don't forget to link them to buttons.
    private class ThemeDark implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Color darkPanel = new Color(25,26,25);
            Color darkButton = new Color(30,81,40);
            Color darkText = new Color(216,233,168);

            panel.setBackground(darkPanel);
            ColorThemeDark.setBackground(darkButton);
            ColorThemeDark.setBackground(darkText);


        }
    }
    private class Themewarren implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Color warrenPanel = new Color(0,0,0);
            Color warrenButton = new Color(240,160,0);
            Color darkText = new Color(244,244,244);

            panel.setBackground(warrenPanel);
            ColorThemeDark.setBackground(warrenButton);
            ColorThemeDark.setBackground(darkText);


        }
    }
    private class ThemePrimary implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            panel.setBackground(Color.BLUE);
            ColorThemeDark.setBackground(Color.YELLOW);
            ColorThemeDark.setBackground(Color.BLUE);


        }
    }
}
