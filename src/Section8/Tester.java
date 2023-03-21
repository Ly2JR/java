package Section8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

public class Tester implements MouseListener,MouseMotionListener,KeyListener {
    JFrame frame;
    JPanel p;
    JTextField tf;

    boolean isC=false;
    boolean isS=false;
    boolean isP=false;

    void go1(){
        frame=new JFrame();
        Container c=frame.getContentPane();
        p=new JPanel();
        var b1=new JButton("打开");
        var b2=new JButton("关闭");
        var b3=new JButton("返回");
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.setBackground(Color.yellow);
        c.add(p,BorderLayout.NORTH);
        c.setBackground(Color.red);
        frame.setSize(300,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void go2(){
        frame=new JFrame();
        Container c=frame.getContentPane();

        var b1=new JButton("打开");
        var b2=new JButton("关闭");
        var b3=new JButton("返回");
        c.add(b1,BorderLayout.NORTH);
        c.add(b2,BorderLayout.CENTER);
        c.add(b3,BorderLayout.SOUTH);
        frame.setSize(300,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void go3(){
        frame=new JFrame("Example 3");
        tf=new JTextField(30);
        frame.getContentPane().add(tf,BorderLayout.SOUTH);
        frame.addMouseMotionListener(this);
        frame.addMouseListener(this);
        frame.addKeyListener(this);
        frame.setFocusable(true); //使窗体获得焦点，否则无法获取按键
        frame.setSize(300,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void go4(){
        frame=new JFrame("Example 3");
        var d=new MyDrawPanel();
        frame.getContentPane().add(d);
        frame.setSize(600,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Tester t=new Tester();
        t.go4();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.isControlDown()){
            isC=true;
            System.out.println("Press Control");
        }
        if(e.isShiftDown()){
            isS=true;
            System.out.println("Press Shift");
        }
        isP=true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
            isP=false;
            isS=false;
            isC=false;
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

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        String s="X:"+e.getX()+",Y:"+e.getY()+"Ctrl:"+(isC?"C":"")+"Shift:"+(isS?"S":"")+"Any key Press:"+(isP?"D":"U");
        tf.setText(s);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    class MyDrawPanel extends JPanel{
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D r=(Graphics2D) g;
            RoundRectangle2D rect=new RoundRectangle2D.Double(30,40,50,50,5,5);
            r.draw(rect);

            Rectangle2D rect2=new Rectangle2D.Double(40,50,70,70);
            r.draw(rect2);

            r.setColor(Color.green);
            Ellipse2D e=new Ellipse2D.Float(150,150,80,80);
            r.fill(e);
            r.draw(e);

        }
    }
}
