import java.util.Scanner;

/**
 * 检测是否回文
 */
public class isHuiWenTest {
    public static boolean isHuiWen(String context){
        int len=context.length()-1;
        boolean suc=true;
        for(int i=0;i<context.length()/2;i++){
            suc= (context.charAt(i)==context.charAt(len-i));
            if(!suc)return suc;
        }
        return  suc;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("请输入要判断是否回文的内容:");
        String context=scan.nextLine();
        boolean suc=isHuiWen(context);
        System.out.println(suc);
    }
}
