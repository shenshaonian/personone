package 线程.future模式实现;

/**
 * @description:
 * @author: 范子祺
 **/
public class FutureClient {


    public Data request(final String s) {
        final FutureData futureData = new FutureData();
        new Thread(new Runnable() {
            @Override
            public void run() {
                RealData realData = new RealData(s);
                futureData.setRealData(realData);
            }
        }).start();
        return futureData;
    }

}
