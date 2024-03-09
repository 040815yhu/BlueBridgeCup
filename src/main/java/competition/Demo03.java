package competition;

import java.util.Scanner;

/**
 * @Author YwaiX
 * @Date 2024/3/9 19:28
 * @Description Demo03
 * 蓝桥杯算法双周赛第7场小白入门赛第三题
 * 奇偶排序
 * 小蓝所在的王国名为偶数王国，在他们王国中数字的比较通常按以下步骤进行：
 *      如果两个数字的奇偶性不同，那么偶数一定大于奇数。
 *      如果两个数字的奇偶性相同，则比较它们的实际数值大小。
 * 现在给你一个正整数数组 A，请你输出按照偶数王国规则从小到大排序后的 A。
 * 输入格式
 *      第一行输入一个整数 N(1<=N<=10^3)表示数组A的长度
 *      第二行输入N个整数,A1,A2,A3,...An(1<=Ai<=10^5)表示数组A
 * 输出格式
 *      输出一行N个整数表示答案
 * 样例输入
 *      5
 *      1 2 3 4 5
 * 样例输出
 *      1 3 5 2 4
 */
public class Demo03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int len = scan.nextInt();
        //数组长度
        int[] arr = new int[len];
        //奇数计数
        int oddCount = 0;
        //偶数计数
        int evenCount = 0;
        for (int i = 0; i < len; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] %2==0){
                evenCount++;
            }else {
                oddCount++;
            }
        }
        int[] odd = new int[oddCount];
        int[] event = new int[evenCount];
        System.out.println(oddCount);
        System.out.println(evenCount);
        int x = 0 ;
        int y = 0;
        for (int i = 0 ; i < len ; i++){
            if (arr[i] %2==0){
                event[x] = arr[i];
                x++;
            }
        }
        for (int i = 0 ; i < len ; i++){
            if (arr[i] %2!=0){
                odd[y] = arr[i];
                y++;
            }
        }
        //System.out.println(Arrays.toString(odd));
        //System.out.println(Arrays.toString(event));
        int[] oddSort = sort(odd);
        int[] eventSort = sort(event);
        //System.out.println(Arrays.toString(oddSort));
        //System.out.println(Arrays.toString(eventSort));
        int j = 0;
        for (int i = 0 ; i < len ; i++){
            if (i < oddCount){
                arr[i] = oddSort[i];
            }
            else {
                arr[i] = eventSort[j];
                j++;
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + "\t");
        }
        scan.close();
    }
    
    public static int[] sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
