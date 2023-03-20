package Section8;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo2 {

    public static void main(String[] args) {
        JFrame frame=new JFrame("JFrameDemo2");
        JButton button=new JButton("Press me");

        JPanel contentPanel=new JPanel();
        contentPanel.setLayout(new BorderLayout());
        contentPanel.add(button,BorderLayout.CENTER);
        frame.setContentPane(contentPanel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
