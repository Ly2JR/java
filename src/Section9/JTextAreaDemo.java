package Section9;

import Section8.BorderLayoutDemo;
import Section8.ButtonHandler;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;

public class JTextAreaDemo {

    JFrame frame=new JFrame("JTextArea Demo");
    JTextArea ta1,ta2;
    JButton copy,clear;

    void  go(){
        ta1=new JTextArea(3,15);
        ta1.setSelectedTextColor(Color.red);
        ta2=new JTextArea(7,20);
        ta2.setEnabled(false);

        JScrollPane jsp1=new JScrollPane(ta1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        JScrollPane jsp2=new JScrollPane(ta2,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        copy=new JButton("Copy");

        copy.addActionListener(new ButtonHandler(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ta1.getSelectedText()!=null){
                    ta2.append(ta1.getSelectedText()+"\n");
                }else{
                    ta2.append("\n"+ta1.getText()+"\n");
                }
            }
        });

        clear=new JButton("Clear");
        clear.addActionListener(new ButtonHandler(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ta2.setText("");
            }
        });

        JPanel p1=new JPanel();
        JPanel p2=new JPanel();

        Border etchedBase=BorderFactory.createEtchedBorder();

        Border etched1=BorderFactory.createTitledBorder(etchedBase,"输入区");
        Border etched2=BorderFactory.createTitledBorder(etchedBase,"复制区");

        p1.setBorder(etched1);
        p2.setBorder(etched2);

        p1.add(jsp1);
        p1.add(copy);

        p2.add(jsp2);
        p2.add(clear);

        Container c=frame.getContentPane();
        c.add(p1,BorderLayout.CENTER);
        c.add(p2,BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        JTextAreaDemo t=new JTextAreaDemo();
        t.go();
    }
}
