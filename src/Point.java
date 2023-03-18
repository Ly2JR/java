public class Point {
    private int x;
    private int y;

    public int getY(){return y;}

    public int getX(){return x;}
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public Point(Point p){
        this.x=p.getX();
        this.y=p.getY();
    }

}
