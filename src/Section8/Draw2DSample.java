package Section8;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Draw2DSample {
    JFrame frame;

    void go(){
       frame=new JFrame("Draw2D");
       Container contentPane=frame.getContentPane();
       MyPanel p=new MyPanel();
       contentPane.add(p);

       frame.setSize(400,300);
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Draw2DSample d=new Draw2DSample();
        d.go();
    }

    class MyPanel extends JPanel{

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2d=(Graphics2D) g;
            Line2D line=new Line2D.Double(30.0,30.0,340,30.0);
            g2d.draw(line);

            RoundRectangle2D rRet=new RoundRectangle2D.Double(13.0,30.0,100.0,70.0,40.0,20.0);
            g2d.draw(rRet);

            Shape arc=new Arc2D.Float(30,30,150,150,40,100,Arc2D.OPEN);
            g2d.draw(arc);

            Ellipse2D ellipse=new Ellipse2D.Double(20,30,100,50);
            g2d.draw(ellipse);

            Arc2D arc1=new Arc2D.Double(8,30,85,60,5,90,Arc2D.OPEN);
            g2d.draw(arc1);

            QuadCurve2D curve1=new QuadCurve2D.Double(20,10,90,65,55,115);
            QuadCurve2D curve2=new QuadCurve2D.Double(20,10,15,63,55,115);
            QuadCurve2D curve3=new QuadCurve2D.Double(20,10,54,64,55,115);

            g2d.draw(curve1);
            g2d.draw(curve2);
            g2d.draw(curve3);

        }
    }
}
