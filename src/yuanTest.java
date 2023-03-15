import java.util.Scanner;

public class yuanTest {

    public static void main(String[] args){
        System.out.print("请输入金额:");
        Scanner scan=new Scanner(System.in);
        double money= scan.nextDouble();
        int y1=1;
        double j2=0.2;
        double f5=0.05;
        double f1=0.01;

        var y1c=(int)(money/y1);
        money-=y1c*y1;
        System.out.println("1元 "+y1c+"个");

        var j2c=(int)(money/j2);
        money-=j2*j2c;
        System.out.println("2角 "+j2c+"个");

        var f5c=(int)(money/f5);
        money-=f5*f5c;
        System.out.println("5分 "+f5c+"个");

        var f1c=(int)(Math.ceil(money/f1));
        System.out.println("1分 "+f1c+"个");
    }
}
