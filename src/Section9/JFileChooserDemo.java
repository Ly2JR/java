package Section9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class JFileChooserDemo  implements ActionListener {
    JFrame frame=new JFrame("JFileChooser Demo");
    JFileChooser fc=new JFileChooser();
    JTextField tf=new JTextField();

    JButton openButton,saveButton,deleteButton;

    void go(){
        ImageIcon openIcon=new ImageIcon("open.gif");
        openButton=new JButton("Open a File..",openIcon);
        openButton.addActionListener(this);

        ImageIcon saveIcon=new ImageIcon("save.gif");
        saveButton=new JButton("Save a File..",saveIcon);
        saveButton.addActionListener(this);

        ImageIcon deleteIcon=new ImageIcon("delete.gif");
        deleteButton=new JButton("Delete a File ..",deleteIcon);
        deleteButton.addActionListener(this);

        JPanel jp=new JPanel();
        jp.add(openButton);
        jp.add(saveButton);
        jp.add(deleteButton);

        Container cp=frame.getContentPane();
        cp.add(jp,BorderLayout.CENTER);
        cp.add(tf,BorderLayout.SOUTH);
        frame.setVisible(true);
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        JFileChooserDemo f=new JFileChooserDemo();
        f.go();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button=(JButton) e.getSource();
        if(button==openButton){
            int select=fc.showOpenDialog(frame);
            if(select==JFileChooser.APPROVE_OPTION){
                File file=fc.getSelectedFile();
                tf.setText("Opening:"+file.getName());
            }
            else{
                tf.setText("Open command cancelled by user");
            }
        }
        if(button==saveButton){
            int select=fc.showSaveDialog(frame);
            if(select==JFileChooser.APPROVE_OPTION){
                File file=fc.getSelectedFile();
                tf.setText("Saving:"+file.getName());
            }else{
                tf.setText("Save command cancelled by user");
            }
        }
        if(button==deleteButton){
            int select=fc.showDialog(frame,"删除");
            if(select==JFileChooser.APPROVE_OPTION){
                File file=fc.getSelectedFile();
                tf.setText("Deleting:"+file.getName());
            }else{
                tf.setText("Delete command cancelled by user");
            }
        }
    }
}
