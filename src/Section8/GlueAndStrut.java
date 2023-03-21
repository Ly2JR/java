package Section8;

import javax.swing.*;
import java.awt.*;

public class GlueAndStrut {

    JFrame frame;
    Box b1,b2,b3,b4;

    void go(){
        frame=new JFrame("Glue And Strut Example");
        Container contentPanel=frame.getContentPane();
        contentPanel.setLayout(new GridLayout(4,1));

        b1=Box.createHorizontalBox();
        b1.add(new JLabel("Box1:"));
        b1.add(new JButton("Yes"));
        b1.add(new JButton("No"));
        b1.add(new JButton("Cancel"));

        b2=Box.createHorizontalBox();
        b2.add(new JLabel("Box2:"));
        b2.add(new JButton("Yes"));
        b2.add(new JButton("No"));
        b2.add(Box.createHorizontalGlue());
        b2.add(new JButton("Cancel"));

        b3=Box.createHorizontalBox();
        b3.add(new JLabel("Box3:"));
        b3.add(new JButton("Yes"));
        b3.add(new JButton("No"));
        b3.add(Box.createHorizontalStrut(20));
        b3.add(new JButton("Cancel"));

        b4=Box.createHorizontalBox();
        b4.add(new JLabel("Box4:"));
        b4.add(new JButton("Yes"));
        b4.add(new JButton("No"));
        b4.add(Box.createRigidArea(new Dimension(50,90)));
        b4.add(new JButton("Cancel"));

        contentPanel.add(b1);
        contentPanel.add(b2);
        contentPanel.add(b3);
        contentPanel.add(b4);

        frame.setSize(300,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        GlueAndStrut g=new GlueAndStrut();
        g.go();
    }
}
