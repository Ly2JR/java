public class StudentTester {
    public String Name;
    public String No;
    public String Age;
    public float[] Scores=new float[3];

    public StudentTester(String name,String no,String age,float score1,float score2,float score3){
        this.Name=name;
        this.No=no;
        this.Age=age;
        Scores[0]=score1;
        Scores[1]=score2;
        Scores[2]=score3;
    }

    public float getAvg(){
        int sum=0;
        if(Scores.length==0)return 0f;
        for(var i=0;i<Scores.length;i++){
            sum+=Scores[i];
        }
        return sum/(float)Scores.length;
    }

    public static void SortDesc(StudentTester[] stus){
        for(int i=0;i<stus.length;i++){
            for(int j=i;j<stus.length;j++){
                if(stus[i].getAvg()<stus[j].getAvg()){
                    StudentTester t=stus[i];
                    stus[i]=stus[j];
                    stus[j]=t;
                }
            }
        }
    }

    public static int[] delete(int[] a){
        int[] n=new int[a.length];

        int index=0;
        for(int i=0;i<a.length;i++){
            if(i%2==0&&a[i]%2==0){
                n[index]=a[i];
                index++;
            }
        }

        int[] b=new int[index];
        System.arraycopy(n,0,b,0,index);
        return b;
    }


    public static void main(String[] args) {
        StudentTester[] students=new StudentTester[3];
        students[0]=new StudentTester("张三","001","男",68,81,93);
        students[1]=new StudentTester("李四","002","男",81,88,93);
        students[2]=new StudentTester("王二","003","男",74,79,73);
        SortDesc(students);
        for (int i=0;i<students.length;i++){
            System.out.println(students[i].Name+"\t"+students[i].No+"\t"+students[i].Age+"\t"+students[i].getAvg());
        }

        int[] a={1,3,4,5,6,7,8,2,3,1,2,3,4};
        var b= delete(a);
        for (int i=0;i<b.length;i++){
            System.out.print(b[i]+"\t");
        }
    }
}
