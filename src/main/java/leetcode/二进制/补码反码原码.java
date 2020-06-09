package leetcode.二进制;

/**
 * @description:
 * @author: 范子祺
 **/
public class 补码反码原码 {
//    链接：https://www.nowcoder.com/questionTerminal/8ee967e43c2c4ec193b040ea7fbb10b8?f=discussion
//    来源：牛客网

    //--------------------最优解----------------------------
    public static int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            ++count;
            n = (n - 1) & n;
        }
        return count;
    }

    public static void main(String[] args) {
        //使用n=10,二进制形式为1010，则1的个数为2；
        int n = -10;
        System.out.println(n + "的二进制中1的个数：" + NumberOf1(n * -1));
    }

}
