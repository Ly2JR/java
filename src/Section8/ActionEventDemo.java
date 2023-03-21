package Section8;

import javax.swing.*;
import java.awt.*;

public class ActionEventDemo {
    public static void main(String[] args) {
        JFrame frame=new JFrame("ActionEvent Demo");
        JButton b=new JButton("Press me");
        b.addActionListener(new ButtonHandler());
        frame.getContentPane().add(b, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
