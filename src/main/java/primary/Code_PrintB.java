package primary;

/**
 * @author : liuf
 * @version V1.0
 * @title: Code_PrintB
 * @date 2022年01月20日 15:32
 **/
public class Code_PrintB {

    //打印int类型的二进制数
    public static void print(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int num = -8;
        print(num);

        int num2 = Integer.MIN_VALUE;
        print(num2);

        int num3 = Integer.MAX_VALUE;
        print(num3);

        Integer.toBinaryString(10);
    }
}