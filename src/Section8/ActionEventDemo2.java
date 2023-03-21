package Section8;

import javax.swing.*;
import java.awt.*;

public class ActionEventDemo2 {
    public static void main(String[] args) {
        JFrame frame=new JFrame("ActionEvent Demo2");
        MyButton b=new MyButton("Close");
        frame.getContentPane().add(b, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
