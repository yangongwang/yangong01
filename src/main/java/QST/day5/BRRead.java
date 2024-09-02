package QST.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {
    public static void main(String[] args) throws IOException {
        //定义一个变量保存输入的字符
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按q结束");
        do{
            c = (char)br.read();
            System.out.println(c);
        }while (c != 'q');
        String s;
        System.out.println("输入字符串，碰到end结束");
        do {
            s = br.readLine();
            System.out.println(s);
        } while (!s.equals("end"));
    }
}
