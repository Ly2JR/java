package Section8;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo {

    private JFrame frame;
    private JButton b1,b2,b3,b4,b5,b6;
    public void go(){
        frame=new JFrame("Grid Layout");
        Container contentPane=frame.getContentPane();
        contentPane.setPreferredSize(new Dimension(400,350));
        contentPane.setLayout(new GridLayout(3,2));
        b1=new JButton("grid_1");
        b2=new JButton("grid_2");
        b3=new JButton("grid_3");
        b4=new JButton("grid_4");
        b5=new JButton("grid_5");
        b6=new JButton("grid_6");

        contentPane.add(b1);
        contentPane.add(b2);
        contentPane.add(b3);
        contentPane.add(b4);
        contentPane.add(b5);
        contentPane.add(b6);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        GridLayoutDemo g=new GridLayoutDemo();
        g.go();
    }
}
