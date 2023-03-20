package Section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tester {

    public static void main(String[] args) {

        try {
            InputStreamReader r;
            r=new InputStreamReader(System.in);
            BufferedReader in;
            in=new BufferedReader(r);
            String s;
            int limit='s';
            int limitCount=5;
            int t=0;
            while((s=in.readLine())!=null){
                for(var i=0;i<s.length();i++){
                    if(s.charAt(i)==limit){
                        t++;
                    }
                }
                if(t<limitCount){
                    System.out.println("少于指定字符串s个数5");
                }
            }
        }
       catch (IOException e){
            System.out.println(e.getStackTrace());
       }
    }

}
