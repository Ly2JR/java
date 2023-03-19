public class moveOddFrontTester {

    public static void moveOddFront(int[] a){
        for(int k=0,odd=0;k<a.length;k++){
            if(a[k]%2==1){//奇数
                int t=a[odd];
                a[odd]=a[k];
                a[k]=t;
                odd++;
            }
        }
    }

    public static void main(String[] args) {
       int[] a={4,3,65,2,15,6,3};
       moveOddFront(a);
       for (int i=0;i<a.length;i++){
           System.out.print(a[i]+" ");
       }
    }
}
