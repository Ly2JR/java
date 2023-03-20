package Section7;

import java.io.*;

public class StudentSerializable implements Serializable {
    int id;
    String name;
    int age;
    String department;

    /**
     * 忽略序列化
     */
    transient String extra;

    public StudentSerializable(int id,String name,int age,String department){
        this.id=id;
        this.name=name;
        this.age=age;
        this.department=department;
    }

    public void Print(){
        System.out.println("ID:"+id+";Name:"+name+";age:"+age+";dept:"+department);
    }

    public static void main(String[] args) {
//        try {
//            StudentSerializable stu=new StudentSerializable(981036,"Li Ming",16,"CSD");
//            FileOutputStream fo=new FileOutputStream("data.ser");
//            ObjectOutputStream so=new ObjectOutputStream(fo);
//            so.writeObject(stu);
//            so.close();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }

        try {
            StudentSerializable stu;
            FileInputStream fi=new FileInputStream("data.ser");
            ObjectInputStream si=new ObjectInputStream(fi);
            stu=(StudentSerializable) si.readObject();
            si.close();
            stu.Print();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
