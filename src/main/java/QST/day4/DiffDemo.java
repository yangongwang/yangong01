package QST.day4;

import java.util.Date;

public class DiffDemo {
    public static void main(String[] args) {
        try{
            //记录开始时间
            long start = System.currentTimeMillis();
            //休眠两秒
            Thread.sleep(2000);
            System.out.println(new Date());
            //记录结束时间
            long end = System.currentTimeMillis();
            //计算差值
            long diff = end-start;
            System.out.println(diff);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
