import java.text.DecimalFormat;

public class MyLine {
    private Point p1;
    private Point p2;

    public MyLine(Point point1,Point point2){
        p1=new Point(point1);
        p2=new Point(point2);
    }


    /**
     * (Q-P1)*(P2-P1)=0
     * @param q
     * @return
     */
    public boolean onSegment(Point q){
        if((q.getX()-p1.getX())*(p2.getY()- p1.getY())
                ==
                (p2.getX()-p1.getX())*(q.getY()-p1.getY())
//                        &&
//                        Math.min(p1.getX(),p2.getX())<=q.getX()
//                        &&q.getX()<=Math.max(p1.getX(),p2.getX())
//                    &&
//                    Math.min(p1.getY(),p2.getY())<=q.getY()
//                    &&q.getY()<=Math.max(p1.getY(),p2.getY())
                )
                return true;
            else
                return false;
    }

    /**
     * 获取斜边
     * @return
     */
    private double getLenWithPoint(Point a,Point b){
        return  Math.sqrt(Math.pow(b.getX()-a.getX(),2)+Math.pow(b.getY()-a.getY(),2));
    }

    /**
     * 点到线的距离
     * @param q
     * @return
     */
    public double getLength(Point q){
        var a=getLenWithPoint(p1,p2);
        var b=getLenWithPoint(p1,q);
        var c=getLenWithPoint(p2,q);
        if(onSegment(q))//点在线段上
        {
            return 0;
        }
        else if(b*b>=a*a+c*c){
            return  c;
        }
        else if(c*c>=a*a+b*b){
            return  b;
        }else{
            double p=(a+b+c)/2;//周长
            double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));//海伦公式求面面积
            return 2*s/a;//利用点到线的距离(利用三角形面积公式求高)
        }
    }

    /**
     * (y2-y1)/(x2-x1)
     * @return 点的斜率
     */
    public String getSlope(){
       var y=  p2.getY()-p1.getY();
       var x=p2.getX()-p1.getX();
       if(x==0)return "无穷大";
       if(y==0)return "0";
        DecimalFormat d=new DecimalFormat("0.##");
       var s=d.format(y*1.0/x) ;
       return String.valueOf(s);
    }

    public static void main(String[] args) {
        var p1=new Point(1,1);
        var p2=new Point(4,4);
        var myline=new MyLine(p1,p2);
        var a=myline.getSlope();
        System.out.println("点1("+p1.getX()+","+p1.getY()+"),点2("+p2.getX()+","+p2.getY()+")的斜率是:"+a);
        var q=new Point(4,0);
        var isLine=myline.onSegment(q);
        var area=myline.getLength(q);
        System.out.println("点Q("+q.getX()+","+q.getY()+")"+(isLine?"在":"不在")+"点1("+p1.getX()+","+p1.getY()+"),点2("+p2.getX()+","+p2.getY()+")");
        System.out.println("点Q("+q.getX()+","+q.getY()+")到点1("+p1.getX()+","+p1.getY()+"),点2("+p2.getX()+","+p2.getY()+")的距离是:"+area);

    }
}
