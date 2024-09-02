package algorithm;

public class bubbleSort {
    public static void main(String[] args) {
        int [] arrList=new int[100];
        randomData(arrList);
        bubble_sort(arrList);
    }
    public static void randomData(int [] arr){
        for (int i=0;i<arr.length;i++){
            arr[i]= (int) (Math.random()*100);
        }
    }
    public static void print(int [] arr){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
    public static void bubble_sort(int [] arr){
        System.out.println("冒泡排序之前的数据："+"\n");
        print(arr);
        int empty;
        for (int i=0;i< arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if (arr[j-1]>arr[j]){
                    empty=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=empty;
                }else {}
            }
        }
        System.out.println("\n"+"冒泡排序之后的数据："+"\n");
        print(arr);
    }
}
