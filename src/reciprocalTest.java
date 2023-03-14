public class reciprocalTest {

    public static double reciprocal(int n){
        if(n==1)return 1.00d;
        System.out.print("1/"+n+"+");
        return (1.00/n)+(1.00/reciprocal(--n));
    }

    public static  double reciprocal2(int n){
        double sum=0;
        for (int i=1;i<=n;i++){
            sum+=1/i;
            System.out.print("1/"+i+"+");
        }
        return  sum;
    }

    public static  double reciprocal3(int n){
        double sum=1;
        sum+=1/3;
        System.out.print("1+1/3");
        if(n==1) {
            return sum;
        }
        for (int i=2;i<=n;i++){
            sum+=1/(3*i);
            System.out.print("+1/"+(3*i));
        }
        return  sum;
    }

    public static void main(String[] args) {
        double a= reciprocal(5);
        System.out.println("   ");
        System.out.println("1----"+a);
        double b=reciprocal2(5);
        System.out.println("   ");
        System.out.println("2---"+b);

        double c=reciprocal3(2);
        System.out.println("   ");
        System.out.println("3--"+c);
    }
}
