package QST.day4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        //创建一个SimpleDataFormat
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        //输入字符串
        String in = "1919-12-12";
        System.out.println(in + " Parses as ");
        //创建一个日期格式
        Date t;
        try {
            //将字符串转变为指定的日期格式
            t = ft.parse(in);
            System.out.println(t);
            System.out.println(ft.format(t));
        }catch (ParseException e){
            System.out.println("有异常");
        }
    }
}
