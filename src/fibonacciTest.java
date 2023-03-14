public class fibonacciTest {

    public static void Fibonacci(int m){
        int f1=1,f2=1,f3;
        System.out.println(f1);
        System.out.println(f2);
        while (true){
            f3=f1+f2;
            if(f3>m) return;
            System.out.println(f3);
            f1=f2;
            f2=f3;
        }
    }
    public static void main(String[] args) {
        Fibonacci(15);
    }
}
