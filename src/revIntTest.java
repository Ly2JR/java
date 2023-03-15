import java.util.Scanner;

public class revIntTest {

    public static String revInt(int n){
        String nString=String.valueOf(n);
        String revString="";
        for(int i=nString.length()-1;i>=0;i--){
            revString+=nString.charAt(i);
        }
        return revString;
    }
    public static void main(String[] args) {
        System.out.print("请输入整数:");
        Scanner scan=new Scanner(System.in);
        var n=scan.nextInt();
        var s=revInt(n);
        System.out.println(s);
    }
}
