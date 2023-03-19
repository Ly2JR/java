public class StringTester2 {
    public static void main(String[] args) {
        //相同字符串只存在一个
        String s1="This is the second string.";
        String s2="This is the second string.";
        String s3=new String("This is the second string.");
        String s4=new String(s1);
        String s5=s1;
        boolean result121=s1.equals(s2); //true
        boolean result122=s1==s2;    //true
        boolean result131=s1.equals(s3);//true
        boolean result132=s1==s3;//false
        boolean result141=s1.equals(s4);//true
        boolean result142=s1==s4; //false
        boolean result151=s1.equals(s5); //true
        boolean result152=s1==s5; //true
        System.out.println(result121);
        System.out.println(result122);
        System.out.println(result131);
        System.out.println(result132);
        System.out.println(result141);
        System.out.println(result142);
        System.out.println(result151);
        System.out.println(result152);
    }
}
