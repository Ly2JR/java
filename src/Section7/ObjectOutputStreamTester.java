package Section7;

import javax.imageio.IIOException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjectOutputStreamTester {
    public static void main(String[] args) {
        Date d=new Date();
        try {
            FileOutputStream f=new FileOutputStream("date.ser");
            ObjectOutputStream s=new ObjectOutputStream(f);
            s.writeObject(d);
            s.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
