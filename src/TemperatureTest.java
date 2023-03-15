import java.util.Scanner;

public class TemperatureTest {

    /**
     * 华市温度转摄氏温度
     * @param h
     * @return
     */
    public static double HToS(double h){
        return 5*(h-32)/9;
    }

    /**
     * 摄氏温度转华市温度
     * @param s
     * @return
     */
    public static double StoH(double s){
        return 9*s/5+32;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("请输入华氏温度:");
        double h=scan.nextDouble();
        double s=HToS(h);
        System.out.println("摄氏温度是:"+s);
    }
}
