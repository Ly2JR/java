package Section6;

public abstract class Vehicle {

    private String name;

    public String getName(){return name;}
    public void setName(String n){
        name=n;
    }


    public Vehicle(String n){
        name=n;
    }

    private String type;

    public String getType(){return type;}
    public void setType(String t){ type=t;}
    private float weight;
    public float getWeight(){return weight;}
    public void setWeight(float w){weight=w;}
    private String size;

    public String getSize(){return  size;}
    public void  setSize(String s){size=s;}

    private String desc;
    public String getDesc(){return desc;}
    public void  setDesc(String d){desc=d;}

    private int hold;
    public int getHold(){return  hold;}
    public void setHold(int h){hold=h;}

    private int holdWeight;
    public int getHoldWeight(){return holdWeight;
    }

    public void setHoldWeight(int w){holdWeight=w;}

    private int speed;
    public int getSpeed(){return  speed;}
    public void setSpeed(int s){speed=s;}

    private String fuel;
    public String getFuel(){return fuel;}
    public void  setFuel(String f){fuel=f;}
    public void Print(){
        System.out.println(getName()+",类型:"+getType()+",自重:"+getWeight()+",尺寸:"+getSize()+",燃料:"+getFuel()+",使用目的:"+getDesc()+",载客人数:"+getHold()+",载货吨数:"+getHoldWeight()+",最大时速:"+getSpeed());
    };
}
