package Book;

/**
 * @Author YwaiX
 * @Date 2024/3/10 1:48
 * @Description Demo1_5
 * 求一元二次方程
 * b^2-4ac
 * -b+-根号b^2-4ac/2a
 */
public class Demo1_5 {
    public static void main(String[] args) {
        Result r;
        double a = 2, b = -3, c = 4;
        System.out.println("测试1");
        System.out.println("a=" + a + "b=" + b + "c=" + c);
        r = solve(a, b, c);
        disp(r);
        System.out.println("\n--------");
        
        a=1.0;
        b=-2.0;
        c=1.0;
        System.out.println("测试2");
        System.out.println("a=" + a + "b=" + b + "c=" + c);
        r = solve(a, b, c);
        disp(r);
        System.out.println("\n--------");
        
        a=2.0;
        b=-1.0;
        c=-1.0;
        System.out.println("测试3");
        System.out.println("a=" + a + "b=" + b + "c=" + c);
        r = solve(a, b, c);
        disp(r);
    }
    
    public static Result solve(double a, double b, double c) {
        Result result = new Result();
        double d = b * b - 4 * a * c;
        if (d < 0) {
            result.resultCount = 0;
        } else if (Math.abs(d) <= 0.0001) {
            result.resultCount = 1;
            result.result1 = (-b + Math.sqrt(d)) / (2 * a);
        } else {
            result.resultCount = 2;
            result.result1 = (-b + Math.sqrt(d)) / (2 * a);
            result.result2 = (-b - Math.sqrt(d)) / (2 * a);
        }
        return result;
    }
    
    public static void disp(Result r) {
        if (r.resultCount == 0) {
            System.out.printf("无根");
        } else if (r.resultCount == 1) {
            System.out.printf("一个跟为%.1f", r.result1);
        } else {
            System.out.printf("两个跟为%.1f和%.2f", r.result1, r.result2);
        }
    }
}
