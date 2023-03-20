package Section8;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo {

    public static void main(String[] args) {
        JFrame frame=new JFrame("JFrameDemo");
        JButton button=new JButton("Press me");
        frame.getContentPane().add(button, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
