public class calYearsTest {

    /**
     *
     * @param m 存款
     * @param r 利率
     * @param k 原来的?倍
     * @return 年
     */
    public static int calYeas(double m,double r,int k){
        double money;int years=0;
        money=m;
        while (money<=m*k){
            years=years+1;
            money*=(1+r);
        }
        return years;
    }
    public static void main(String[] args) {

        int y=calYeas(100,0.12,5);
        System.out.println(y);
    }
}
