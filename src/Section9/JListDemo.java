package Section9;

import Section8.ButtonHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class JListDemo {
    JFrame frame=new JFrame();
    JList list;
    DefaultListModel listModel;
    JPanel panel;
    JTextField tf;
    JButton button;

    void go(){
        listModel=new DefaultListModel();
        listModel.addElement("One");
        listModel.addElement("Two");
        listModel.addElement("Three");
        listModel.addElement("Four");
        list=new JList(listModel);

        JScrollPane jsp=new JScrollPane(list,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        Container cp=frame.getContentPane();
        cp.add(jsp);
        tf=new JTextField(15);
        button=new JButton("Addd new item");
        button.addActionListener(new ButtonHandler(){
            @Override
            public void actionPerformed(ActionEvent e) {
                listModel.addElement(tf.getText());
            }
        });

        panel=new JPanel();
        panel.add(tf);
        panel.add(button);

        cp.add(panel,BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        JListDemo jd=new JListDemo();
        jd.go();
    }
}
