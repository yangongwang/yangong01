package QST.day4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date =new Date();
        System.out.println(date.getTime());
        System.out.println(date.after(new Date(2024, 1, 1)));
        System.out.println(date.before(new Date(2024, 1, 1)));
        System.out.println(date.compareTo(new Date(2024, 1, 1)));
        System.out.println(date.equals(new Date(2024, 1, 1)));
        System.out.println(date.getTime());
        System.out.println(date.getTimezoneOffset());
        System.out.println(date);
        System.out.println(date.toString());
        //将当前时间格式化输出
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = ft.format(date);
        System.out.println("当前的时间为："+format);
    }
}
