import java.security.PublicKey;
import java.text.DecimalFormat;

public class MyCircle {

    public int raduis;
    public int centerX;
    public int centerY;

    public MyCircle(int r,int x,int y){
        this.raduis=r;
        this.centerX=x;
        this.centerY=y;
    }
    private DecimalFormat d=new DecimalFormat("0.##");

    /**
     * 圆的面积：PI*R*R
     * @return
     */
    public String getArea(){
        return d.format(Math.PI*raduis*raduis);
    }

    /**
     * 圆的周长：P1*R*2
     * @return
     */
    public String getCircumference(){
        return d.format(Math.PI*raduis*2);
    }

    /**
     * 判断两个圆是否相交
     * @param x
     * @param y
     * @param r
     * @return
     */
    public boolean isCross(int x,int y,int r){
        //判断两个圆的圆心点距离
        return Math.sqrt(Math.pow(centerX-x,2)+Math.pow(centerY-y,2))<=(r+raduis);
    }

    /**
     * d=|Ax0+By0+c|/根号√ A*A+B*B
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     */
    public void lineCircle(int x1,int y1,int x2,int y2){
        //先求直线方程Ax+By+C=0;既
        var a=y2-y1;
        var b=x1-x2;
        var c=x2*y1-x1*y2;
        //两点长
        var cc=Math.sqrt(a*a+b*b);
        //d=|Ax0+By0+c|/根号√ A*A+B*B
        var d=Math.abs(a*centerX+b*centerY+c)/cc;
        if(d>raduis){
            System.out.println("圆和直线的关系是:相离");
        }
        if(d==raduis){
            System.out.println("圆和直线的关系是:相切");
        }
        if(d<raduis){
            System.out.println("圆和直线的关系是:相交");
        }
    }
}
