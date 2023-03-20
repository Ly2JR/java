package Section7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class ObjectInputStreamTester {
    public static void main(String[] args) {
        Date d=null;
        try {
            FileInputStream f=new FileInputStream("date.ser");
            ObjectInputStream s=new ObjectInputStream(f);
            d=(Date)s.readObject();
            s.close();

            System.out.println("Date serialized at "+d);
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
