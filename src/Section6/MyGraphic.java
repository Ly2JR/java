package Section6;

public abstract class MyGraphic {

    private String name;

    public MyGraphic(String n){
        name=n;
    }

    public String GetName(){
        return name;
    }
    public abstract void  Print();
}
