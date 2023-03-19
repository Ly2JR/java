public class ArrayTester {
    public static void main(String[] args) {
        int[] elements={1,2,3,4,5,6};
        int[] hold={10,9,8,7,6,5,4,3,2,1};
        System.arraycopy(elements,1,hold,2,4);
        for(int i=0;i<hold.length;i++){
            System.out.print(hold[i]+ " ");
        }
    }
}
