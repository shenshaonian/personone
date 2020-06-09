package 基本语法;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 * @author: 范子祺
 **/
public class PaymentCodeUtil {
    //ReentrantLock //可重入锁:片面理解:引入了计数器，清零才可释放锁
    private static final ReentrantLock paymentCodeLock = new ReentrantLock();
    private static int serialNum = 0;
    private static final char[] CHARS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /**
     * @描述 生成唯一的支付订单号
     * @参数 String YH或者ZFB(表示是银行账户提现或者支付宝提现)
     * @返回值 String 唯一的付款编码
     */
    public static String getPaymentCodeLock(String code) {
        StringBuilder sb = new StringBuilder();
        try {
            paymentCodeLock.lock();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMddHHmmss");
            String time = simpleDateFormat.format(new Date().getTime());
            sb.append(code);
            sb.append(time);//当前时间到秒
            int m = serialNum / CHARS.length;
            int n = serialNum % CHARS.length;
            sb.append(CHARS[m]);
            sb.append(CHARS[n]);
            if (serialNum >= (39 * 39 - 1)) {
                serialNum = 0;
            } else {
                serialNum++;
            }
            String temp = Long.toString(System.currentTimeMillis(), 36);
            // 转为大写字母，为了美观—__—
            sb.append(temp.toUpperCase());
        } finally {
            paymentCodeLock.unlock();
        }
        return sb.toString();
    }

    @Test
    public void test() {
        System.out.println(PaymentCodeUtil.getPaymentCodeLock("fanziqi"));
    }
}
