package Book.Demo1_6_5;

import java.util.Scanner;

/**
 * @Author YwaiX
 * @Date 2024/3/10 3:08
 * @Description Demo01
 * 判断素数
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("请输入一个数");
        int number = user.nextInt();
        if (number == 0 || number == 1) {
            System.out.println(number + "不是素数");
            return;
        }
        int i;
        for (i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                break;
            }
        }
        if (i > Math.sqrt(number)) {
            System.out.println("是素数");
        } else {
            System.out.println("不是素数");
        }
    }
}
