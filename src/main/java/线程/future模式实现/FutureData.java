package 线程.future模式实现;

/**
 * @description:
 * @author: 范子祺
 **/
public class FutureData implements Data{
    private RealData realData;
    private Boolean isReady = false;



    public synchronized void setRealData(RealData realData) {
        if (isReady){
            return;
        }
        this.realData = realData;
        isReady = true;
        notify();
    }

    //这个synchronized如果不加会报异常
    @Override
    public synchronized String getRequest() {
        while (!isReady){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        return this.realData.getRequest();
    }
}
