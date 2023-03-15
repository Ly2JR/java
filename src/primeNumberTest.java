import java.util.Scanner;

/**
 * 质数
 */
public class primeNumberTest {
    public  static  boolean isPrimeNumber(int n){
        if(n<3)return n>1;
        for(int i=2;i<n;i++){
            if(n%i==0)return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("请输入要判断是否质数的数:");
        int context=scan.nextInt();
        boolean suc=isPrimeNumber(context);
        System.out.println(suc);
    }
}
