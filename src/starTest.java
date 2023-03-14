public class starTest {

    public static void star(int n){
       for(var i=0;i<n;i++){
           for(var j=0;j<n;j++){
               if(j<i){
                   System.out.print(" * ");
               }else{
                   System.out.print("   ");
               }
           }
           System.out.println("");
       }
    }
    public static void main(String[] args) {
        star(7);
    }
}
