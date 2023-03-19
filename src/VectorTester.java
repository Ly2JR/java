import java.util.Objects;
import java.util.Vector;

public class VectorTester extends Vector {
    public VectorTester(){
        super(1,1);
    }

    public  void addInt(int i){
        addElement(new Integer(i));
    }

   public void addFloat(float f){
        addElement(new Float(f));
   }

   public void addString(String s){
        addElement(s);
   }

   public void addCharArray(char[] a){
        addElement(a);
   }

   public void  printVector(){
       Object o;
       int length=size();
       System.out.println("Number of vector element is "+length+" and they are: ");
       for(int i=0;i<length;i++){
           o=elementAt(i);
           if(o instanceof char[]){
               System.out.println(String.copyValueOf((char[])o));
           }
           else{
               System.out.println(o.toString());
           }
       }
   }

    public static void main(String[] args) {
        VectorTester v=new VectorTester();
        int digit=5;
        float real=3.14f;
        char[] letters={'a','b','c','d'};
        String s=new String("Hi there!");
        v.addInt(digit);
        v.addFloat(real);
        v.addString(s);
        v.addCharArray(letters);
        v.printVector();
    }
}
