package Section9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Tester implements ActionListener {
    JFrame frame;
    JTextField tf;

    JTextField t1;

    JTextField t2;

    JButton b1,b2,b3,b4;

    JTextArea ta;

    JComboBox cb;

    void  go(){
        frame=new JFrame();
        tf=new JTextField(30);
        var jsp=new JScrollPane(tf,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        frame.getContentPane().add(jsp);

        frame.setSize(300,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    void  go2(){
        frame=new JFrame("Example2");

        JPanel p1=new JPanel();
        JLabel l1=new JLabel("Source");
         t1=new JTextField(10);
        p1.add(l1);
        p1.add(t1);

        JPanel p2=new JPanel();
        JLabel l2=new JLabel("Target");
         t2=new JTextField(10);
        p2.add(l2);
        p2.add(t2);

        JPanel p3=new JPanel();
        b1=new JButton("Clear");
        b1.addActionListener(this);
        b2=new JButton("Copy");
        b2.addActionListener(this);
        b3=new JButton("Close");
        b3.addActionListener(this);
        p3.add(b1);
        p3.add(b2);
        p3.add(b3);

        Container c=frame.getContentPane();
        c.setLayout(new GridLayout(5,1));
        c.add(p1);
        c.add(p2);
        c.add(p3);


        frame.setSize(300,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    void go3(){
        frame=new JFrame("Example");
        Container c=frame.getContentPane();

        JPanel p1=new JPanel();
        p1.setLayout(new BoxLayout(p1,BoxLayout.Y_AXIS));
        p1.add(new JLabel("Information"));
        ta=new JTextArea(4,4);
        p1.add(ta);


        JPanel p2=new JPanel();
        p2.setLayout(new BoxLayout(p2,BoxLayout.Y_AXIS));
        p2.add(new JLabel("Select Name"));
        cb=new JComboBox();
        cb.addItem("Tom");
        cb.addItem("Jack");
        cb.addItem("Mary");
        cb.addItem("Linda");
        cb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String s= (String)e.getItem();
                var state=e.getStateChange();
                if(state==ItemEvent.SELECTED){
                    ta.append("\n"+s+" is a good body");
                }

            }
        });
        p2.add(cb);

        b4=new JButton("Close");
        b4.addActionListener(this);
        p2.add(b4);


        c.setLayout(new GridLayout(1,2));
        c.add(p1,BorderLayout.WEST);
        c.add(p2,BorderLayout.EAST);

        frame.setSize(300,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        var t=new Tester();
        t.go3();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button=(JButton) e.getSource();
        if(button==b1){
            t1.setText("");
            t2.setText("");
        }
        if(button==b2){
            String s=t1.getText();
            t2.setText(s);
        }
        if(button==b3){
            System.exit(0);
        }
        if(button==b4){
            System.exit(0);
        }
    }
}
