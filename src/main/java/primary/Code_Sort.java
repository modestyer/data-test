package primary;

/**
 * @author : liuf
 * @version V1.0
 * @title: Code_SelectionSort
 * @date 2022年01月24日 16:02
 **/
public class Code_Sort {

    public static void swap(int[] arr, int i, int minIndex) {
        int tmp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = tmp;
    }

    /**
     * 选择排序
     * 选择排序是直接找数组里最小的排
     * 当找到最小值后，和当前值交换下标
     * 最小值就不需要参与比较了，只需要关注后边得数字
     * @param arr :
     * @return : void
     * @author : liuf
     * @date : 2022年01月24日 16:26
     **/
    public static void selectSort(int[] arr) {
        //这里也可以是i<arr.length-1,因为循环到arr.length-1的时候，j=i+1=arr.length
        //不满足第二个循环了，所以整个循环就结束了
        for (int i = 0; i < arr.length; i++) {
            //记录最小值得下标
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            //交换
            swap(arr, i, minIndex);
        }

    }

    /**
     * 冒泡排序
     *
     * @param arr :
     * @return : void
     * @author : liuf
     * @date : 2022年01月24日 16:26
     **/
    public static void bubbleSort(int[] arr) {

    }

    /**
     * 插入排序
     *
     * @param arr :
     * @return : void
     * @author : liuf
     * @date : 2022年01月24日 16:27
     **/
    public static void insertSort(int[] arr) {

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 3, 5, 1, 6, 8, 1, 3, 5, 7, 5, 6};
        printArray(arr);
        selectSort(arr);
        printArray(arr);
    }
}
