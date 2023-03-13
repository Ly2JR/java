public class Section2 {

    /**
     * 第二节代码示例
     *
     * @param args
     */
    public static void main(String[] args) {
        //例2.7
//        int xTest = (int) (Math.random() * 100), yValue, zVar;
//        boolean flag;
//        int intValue1 = 1, intValue2 = -4;
//        float floatValue = 0.007E-5f;
//        if (xTest > 50) {
//            yValue = 9;
//        }
//        zVar=yValue+xTest;

        int b1=1;
        int b2=1;
        b1<<=31;
        b2<<=31;

        b1>>=31;
        System.out.println(b1);
        b1>>=1;
        System.out.println(b1);

        b2>>>=31;
        System.out.println(b2);
        b2>>>=1;
        System.out.println(b2);
    }
}
