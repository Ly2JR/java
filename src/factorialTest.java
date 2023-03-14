public class factorialTest {

    public static int Factorial(int n){
        if(n==0) return 1;
        return n*Factorial(--n);
    }
    public static void main(String[] args) {
//        int s1= Factorial(0);
//        System.out.println(s1);

//        int s2= Factorial(2);
//        System.out.println(s2);

        int s3= Factorial(4);
        System.out.println(s3);
    }
}
