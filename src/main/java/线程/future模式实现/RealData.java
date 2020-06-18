package 线程.future模式实现;

/**
 * @description:
 * @author: 范子祺
 **/
public class RealData implements Data
{
    private String result;
    public RealData(String s) {
        System.out.println("根据"+s+" 进行查询， 这个操作很耗时(^_^)");
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("耗时操作完毕，获取结果");
        result = "Success";
    }

    @Override
    public String getRequest() {
        return result;
    }
}
