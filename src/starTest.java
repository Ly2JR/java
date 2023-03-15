public class starTest {

    public static void star(int n){
       for(var i=0;i<n;i++){
           for(var j=0;j<n;j++){
               if(j<i){
                   System.out.print(" ");
               }else{
                   System.out.print("*");
               }
           }
           System.out.println(" ");
       }
    }

    public static void star2(int n){
        int mid=(n/2)+1;
        for(int i=0;i<n;i++){
            if(i<mid){
                for(int j=0;j<n;j++){
                    if(j<i||j>n-i-1){
                        System.out.print("   ");
                    }
                    else{
                        System.out.print(" * ");
                    }
                }
            }
            if(i>=mid){
                for(int j=0;j<n;j++){
                    if(j>i||j<n-i-1){
                        System.out.print("   ");
                    }
                    else{
                        System.out.print(" * ");
                    }
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        star2(9);
    }
}
