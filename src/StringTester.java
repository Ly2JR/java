public class StringTester {

    public static void main(String[] args) {
        String s="This is a test String!";
        System.out.println("before changed,s="+s);

        String t=s.toLowerCase();
        System.out.println("after changed,s="+s);
        System.out.println("t="+t);

        StringBuffer strb=new StringBuffer(s);
        System.out.println("s.length="+s.length());
        System.out.println("strb.length="+strb.length());

        t=s.replace('a','o');
        System.out.println("s3.replace="+t);

        StringBuffer s3s3t=strb.replace(2,4,"at");
        System.out.println("strb.replace="+s3s3t);
        System.out.println("strb.capacity="+strb.capacity());
    }
}
