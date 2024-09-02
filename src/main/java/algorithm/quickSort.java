package algorithm;

public class quickSort {
    public static void main(String[] args) {
        int [] arrList=new int[100];
        bubbleSort.randomData(arrList);
        quick_sort(arrList);

    }
    public static void quick_sort(int [] arr) {
        System.out.println("快速排序前:");
        bubbleSort.print(arr);
        System.out.println("\n"+"快速排序后:");
        quicksort(arr,0,99);
        bubbleSort.print(arr);
    }
    public static void quicksort(int [] arr,int left,int right){
        int stu;
        if (left >=right   )
            return;
        stu = stand(arr,left,right);
        quicksort(arr,left,stu-1);
        quicksort(arr,stu+1,right);
    }
    public static int stand(int [] arr,int left,int right) {
        int stand = arr[left];
        int start = left;
        while (left != right) {
            while (arr[right] >= stand && right > left) {
                right--;
            }
            while (arr[left] <= stand && right > left) {
                left++;
            }
            if (right > left) {
                int empty = arr[right];
                arr[right] = arr[left];
                arr[left] = empty;
            }
        }
        arr[start] = arr[right];
        arr[right] = stand;
        return right;
    }
}
