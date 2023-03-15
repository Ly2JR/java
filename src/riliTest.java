import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 日历
 */
public class riliTest {

    public static int getDayOfMonth(int year,int month){

        Calendar cal=Calendar.getInstance();
        cal.set(Calendar.YEAR,year);
        cal.set(Calendar.MONTH,month-1);
        var days= cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        return days;
    }

    public static String getWeekByDay(Date d){
        String[] weekDays={"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        Calendar cal=Calendar.getInstance();
        cal.setTime(d);
        int week=cal.get(Calendar.DAY_OF_WEEK)-1;
        if(week<0){
            week=0;
        }
        return weekDays[week];
    }

    public static int getDaysBetween(String date1str,String date2str) throws ParseException{
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        Date date1=format.parse(date1str);
        Date date2=format.parse(date2str);
        int a=(int)((date1.getTime()-date2.getTime())/(1000*3600*24));
        return Math.abs(a);
    }

    public static void main(String[] args) throws ParseException {
        System.out.print("请输入本年度的月份:");
        Scanner scan=new Scanner(System.in);
        var m=scan.nextInt();
        var days=getDayOfMonth(2023,m);
        System.out.println("本月份的天数:"+days);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        for (int i=1;i<=days;i++){
            String day="2023-"+m+"-"+i;
            Date d=sdf.parse(day);
            String week=getWeekByDay(d);
            if(i%7==0){
                System.out.println("");
            }
            else{
                System.out.print(day+"("+week+") ");
            }
        }

        System.out.println("");
        System.out.print("请输入日期:");
        Scanner scan2=new Scanner(System.in);
        var date1=scan2.nextLine();

        System.out.print("请输入另一个日期:");
        var date2=scan2.nextLine();
        var diff=getDaysBetween(date1,date2);
        System.out.println("相差:"+diff+"天");
    }
}
