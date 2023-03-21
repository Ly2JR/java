package Section9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDialogDemo implements ActionListener {

    JFrame frame;
    JDialog dialog;
    JButton button;

    void go(){
        frame=new JFrame("JDialog Demo");
        dialog=new JDialog(frame,"Dialog",true);
        dialog.getContentPane().add(new JLabel("Hello,I'm a Dialog"));
        dialog.setSize(60,40);

        button=new JButton("Show Dialog");
        button.addActionListener(this);

        Container c=frame.getContentPane();
        c.add(button,BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,150);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        JDialogDemo d=new JDialogDemo();
        d.go();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        dialog.setVisible(true);
    }
}
