package 线程.future模式实现;

/**
 * @description:
 * @author: 范子祺
 **/
public class MainFuture {
    public static void main(String[] args) throws InterruptedException{
        FutureClient fc = new FutureClient();
        Data data = fc.request("请求参数");
        System.out.println("请求发送成功");
        System.out.println("做其他事情");

        String result = data.getRequest();
        System.out.println(result);
    }

}
