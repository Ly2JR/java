package Section6;

public class Rectangle extends MyGraphic {

    private int width;
    private int height;
    public Rectangle(String n) {
        super(n);
    }

    public Rectangle(String n,int w,int h){
        super(n);
        width=w;
        height=h;
    }

    public int getWidth(){return width;}
    public int getHeight(){return height;}

    @Override
    public void Print() {
        System.out.println("这是:"+super.GetName()+",宽度:"+getWidth()+",高度:"+getHeight());
    }
}
