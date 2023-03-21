package Section8;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutDemo {
    JFrame frame;
    JPanel pv,ph;

    void go(){
        frame=new JFrame("Box Layout");
        Container contentPane=frame.getContentPane();
        pv=new JPanel();
        pv.setLayout(new BoxLayout(pv,BoxLayout.Y_AXIS));
        pv.add(new JLabel(" First"));
        pv.add(new JLabel(" Second"));
        pv.add(new JLabel(" Third"));
        contentPane.add(pv,BorderLayout.CENTER);

        ph=new JPanel();
        ph.setLayout(new BoxLayout(ph,BoxLayout.X_AXIS));
        ph.add(new JButton("Yes"));
        ph.add(new JButton("No"));
        ph.add(new JButton("Cancel"));

        contentPane.add(ph,BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void go2(){
        frame=new JFrame("Box Layout");
        Container contentPane=frame.getContentPane();
        pv=new JPanel();
        //var hb= new BoxLayout(pv,BoxLayout.Y_AXIS);
        var hb=Box.createVerticalBox().getLayout();
        pv.setLayout(hb);
        pv.add(new JLabel(" First"));
        pv.add(new JLabel(" Second"));
        pv.add(new JLabel(" Third"));
        contentPane.add(pv,BorderLayout.CENTER);

        ph=new JPanel();
        //var vb= new BoxLayout(ph,BoxLayout.X_AXIS);
        var vb =Box.createHorizontalBox().getLayout();
        ph.setLayout(vb);
        ph.add(new JButton("Yes"));
        ph.add(new JButton("No"));
        ph.add(new JButton("Cancel"));

        contentPane.add(ph,BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        BorderLayoutDemo b=new BorderLayoutDemo();
        b.go();
    }
}
