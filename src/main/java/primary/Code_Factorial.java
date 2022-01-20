package primary;

/**
 * 计算阶乘的和 1!+2!+3!+4!
 * @author : liuf
 * @version V1.0
 * @title: Code_Factorial
 * @date 2022年01月20日 18:19
 **/
public class Code_Factorial {

    /**
     * 两层for循环，暴力方法，计算阶乘
     * @param num
     */
    public static void f1(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += f1_one(i);
        }
        System.out.println(sum);
    }

    public static int f1_one(int num) {
        int sum = 1;
        for (int i = 1; i <= num; i++) {
            sum = i * sum;
        }
        return sum;
    }

    /**
     * 单层for循环，每一个阶乘的结果都是前一个阶乘结果乘以最后一个数字
     * 如：3! = 2!*3
     * @param num
     */
    public static void f2(int num){
        int sum=0;
        int bak=1;
        for (int i=1;i<=num;i++){
            bak = bak*i;
            sum = sum+bak;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int num = 10;
        f1(num);
        f2(num);
    }
}
