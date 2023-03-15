import java.util.Random;

public class randomTest {
    public static void main(String[] args) {
        int[] nums=new int[100];
        int max=0;
        int min=0;
        int n5=0;
        for(var i=0;i<100;i++){
            int n=(int)(100*Math.random());
            if(n>50){
                n5++;
            }
            if(i==0){
                max=n;
                min=n;
            }
            else{
                if(n>=max){
                    max=n;
                }else if(n<min){
                    min=n;
                }
            }
            nums[i]=n;
        }
        for (int i=0;i<nums.length;i++){
            if(i%10==0){
                System.out.println("");
            }
            System.out.print(nums[i]+" ");
        }
        System.out.println("");
        System.out.println("最大数是:"+max);
        System.out.println("最小数是:"+min);
        System.out.println("大于50的整数个数是:"+n5);
    }
}
