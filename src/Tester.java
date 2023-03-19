public class Tester {

    public static void Test3(int n){
        int k,i,j,a[][]=new int[n][n];
        k=1;
        for(i=0;i<n;i++){
            if(i%2==0){
                for(j=0;j<=i;j++){
                    a[i][j]=k++;
                }
                for(j=i-1;j>=0;j--){
                    a[j][i]=k++;
                }
            }
            else{
                for(j=0;j<=i;j++){
                    a[j][i]=k++;
                }
                for(j=i-1;j>=0;j--){
                    a[i][j]=k++;
                }
            }
        }
        for (i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static int[]  arrayReverse(int[] a){
        int l=a.length;
        int[] reverse=new int[l];
        for(int i=0;i<l;i++){
            reverse[i]=a[l-1-i];
        }
        return reverse;
    }

    public static void Sort(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(a[i]>a[j]){
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
    }


    public static int[][] t=new int[100][2];
    /**
     * 判断值是否存在
     * @param v
     * @return
     */
    public static void hasRecord(int v){
        for(var i=0;i<t.length;i++){
            if(t[i][1]==0){
                t[i][0]=v;
                t[i][1]=1;
                return ;
            }
            if(t[i][0]==v){
                t[i][1]++;
            }
        }
    }


    public static void main(String[] args) {
        char[] a={'1','2','3','4','5','6','7'};
        String s1=new String(a,2,4);
        String s2="JavaWorld!";
        System.out.println(s1);
        System.out.println(s2.indexOf("a"));
        System.out.println(s2.replace('t','r'));
        System.out.println(s2.substring(4,6));

        String s11="XYZ";
        String s22="XYZ";
        String s33=new String("XYZ");
        System.out.println("S1==S2="+(s11==s22)+"\ns1==s3="+(s11==s33));

        Test3(4);


        int[] aa={1,4,2,5,6,3};
        int[] resver= arrayReverse(aa);
        for(var i=0;i<resver.length;i++){
            System.out.print(resver[i]+"\t");
        }

        System.out.println("随机100个整数，升序排序:");

        int[] r=new int[1000];
        for(int i=0;i<r.length;i++){
            r[i]=(int)(Math.random()*100);
            System.out.print(r[i]+"\t");

            //统计
            hasRecord(r[i]);
        }
        Sort(r);
        System.out.println("排序后:");
        for(var i=0;i<r.length;i++){
            System.out.print(r[i]+"\t");
        }

        System.out.println("统计每个整数出现的次数:");
        for(var i=0;i<t.length;i++){
            if(t[i][1]==0)return;
            System.out.print("值:"+t[i][0]+"出现:"+t[i][1]+"次 ");
        }
    }
}
