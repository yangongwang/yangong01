package org.example;

public class Example01 {
    private int id;
    private String name;
    private int age;

    public static void main(String[] args) {
        char wang1='a';
        for(int i=1;i<=10;i++){
            Example01 qq = new Example01(i,"Q"+i, (int) (Math.random()*10));
            System.out.print("id:"+ qq.id+"\n"+"name:"+qq.name+"\n"+"age:"+qq.age+"\n\n");
        }
        System.out.println((int)wang1+2+"\n");
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b) );
        System.out.println("b / a = " + (b / a) );
        System.out.println("b % a = " + (b % a) );
        System.out.println("c % a = " + (c % a) );
        System.out.println("a++   = " +  (a++) );
        System.out.println("a--   = " +  (a--) );
        // 查看  d++ 与 ++d 的不同
        System.out.println("d++   = " +  (d++) );
        System.out.println("++d   = " +  (++d) );
        System.out.println("\n");
        int [] qq = {20,21,156,1525,412,2255};
        for (int i = 0; i < qq.length; i++) {
            System.out.println(qq[i]);
        }
        System.out.println("\n");
        for (int i : qq) {
            System.out.println(i);
        }
        Example01.print_lingxing();
        Example01.arraynum_test();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Example01(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public static void print_lingxing(){
        for (int i = 1; i <6 ; i++) {
            for (int j=5; j > i ; j--) {
                System.out.print(" ");
            }
            for(int k = 1;k <= i*2-1;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i <5; i++) {
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int k = 1; k <=9-2*i ; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
    public static void arraynum_test(){
        //创建数组
        int [] num = {20,45,12,58,42,63,41,63};
        //打印全部元素
        System.out.println("数组元素为：");
        for (int i :num) {
            System.out.print(i+"\t");
        }
        //求和
        int sum=0;
        for (int i :num) {
            sum+=i;
        }
        System.out.println("\n"+"sum:"+sum);
        //找最大元素
        int max=0;
        for (int i :num) {
            if (i>max){
                max=i;
            }
        }
        System.out.println("最大数："+max);
    }
}
//使用位运算交换两数


//小猴子