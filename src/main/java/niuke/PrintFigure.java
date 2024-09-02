package niuke;

import java.util.Scanner;

public class PrintFigure {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            int a = in.nextInt();
            //打印上三角
            for (int i = 1; i <=a ; i++) {
                //打印空格
                for (int j = a; j>i ; j--) {
                    System.out.print(" ");
                }
                //打印符号
                for (int k = 1; k <=2*i-1 ; k++) {
                    System.out.print("X");
                }
                //打印行
                System.out.println("");
            }
            //打印下三角
            for (int i = 1; i <a ; i++) {
                //打印空格
                for (int j = 1; j<=i ; j++) {
                    System.out.print(" ");
                }
                //打印符号
                for (int k = 1; k <= 2*a-2*i-1 ; k++) {
                    System.out.print("X");
                }
                //打印行
                System.out.println("");
            }
        }
    }
}
