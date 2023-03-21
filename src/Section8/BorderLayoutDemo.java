package Section8;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {

    private JFrame frame;
    private JButton be,bw,bn,bs,bc;

    public void go(){
        frame=new JFrame("Border Layout");
        Container contentPane=frame.getContentPane();
        be=new JButton("East");
        bs=new JButton("South");
        bw=new JButton("West");
        bn=new JButton("North");
        bc=new JButton("Center");

        contentPane.add(be,BorderLayout.EAST);
        contentPane.add(bs,BorderLayout.SOUTH);
        contentPane.add(bw,BorderLayout.WEST);
        contentPane.add(bn,BorderLayout.NORTH);
        contentPane.add(be,BorderLayout.CENTER);

        frame.setSize(350,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        BorderLayoutDemo b=new BorderLayoutDemo();
        b.go();
    }
}
