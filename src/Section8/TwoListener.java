package Section8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class TwoListener implements MouseMotionListener, MouseListener {

    private JFrame frame;
    private JTextField tf;

    void go(){
        frame=new JFrame("Two listeners example");
        Container contentPane=frame.getContentPane();
        contentPane.add(new JLabel("Click and drag the mouse"),BorderLayout.NORTH);
        tf=new JTextField(30);
        contentPane.add(tf,BorderLayout.SOUTH);
        frame.addMouseListener(this);
        frame.addMouseMotionListener(this);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        TwoListener t=new TwoListener();
        t.go();
    }
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        String s="The mouse entered";
        tf.setText(s);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        String s="The mouse has left the building";
        tf.setText(s);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        String s="Mouse dragged: X="+e.getX()+"Y="+e.getY();
        tf.setText(s);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
