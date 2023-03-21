package Section8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CardLayoutDemo extends MouseAdapter {
    JFrame frame;
    JPanel p1,p2,p3;
    JLabel l1,l2,l3;
    CardLayout card;
    Container contentPane;

    public void go(){
        frame=new JFrame("Card Test");
        contentPane =frame.getContentPane();
        card=new CardLayout();
        contentPane.setLayout(card);

        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();

        l1=new JLabel("This is the first JPanel");
        p1.add(l1);
        p1.setBackground(Color.yellow);

        l2=new JLabel("This is the second JPanel");
        p2.add(l2);
        p2.setBackground(Color.green);

        l3=new JLabel("This is the third JPanel");
        p3.add(l3);
        p3.setBackground(Color.magenta);

        p1.addMouseListener(this);
        p2.addMouseListener(this);
        p3.addMouseListener(this);

        contentPane.add(p1,"First");
        contentPane.add(p2,"Second");
        contentPane.add(p3,"Third");

        card.show(contentPane,"First");
        frame.setSize(300,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        card.next(contentPane);
    }

    public static void main(String[] args) {
        CardLayoutDemo c=new CardLayoutDemo();
        c.go();
    }
}
