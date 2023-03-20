package Section7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTester {
    public static void main(String[] args) {
        try {
            FileInputStream in=new FileInputStream("myFile.dat");
            while (in.available()>0){
                System.out.println((char)in.read()+" ");
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error:Cannot open file fro reading.");
        }
        catch (EOFException e){
            System.out.println("Error:EOF encountered,file may be corrupted");
        }
        catch (IOException e){
            System.out.println("Error:Cannot read from file.");
        }
    }
}
