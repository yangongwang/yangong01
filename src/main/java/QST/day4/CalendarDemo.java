package QST.day4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        //获取对象
        Calendar c = Calendar.getInstance();
        //获取年份
        System.out.println(c.get(Calendar.YEAR));
        //获取月分
        System.out.println(c.get(Calendar.MONTH)+1);
        //计算两百天后是星期几
        c.add(Calendar.DATE,200);
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        //打印200天后的时间
        Date time = c.getTime();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(ft.format(time));

    }
}
