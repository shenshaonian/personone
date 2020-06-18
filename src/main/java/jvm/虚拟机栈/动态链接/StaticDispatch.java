package jvm.虚拟机栈.动态链接;

class Ocean {
}

class River extends Ocean{
}

class Lake extends Ocean{
}

/**
 * https://blog.csdn.net/FloatDreamed/article/details/96147409?utm_medium=distribute.pc_relevant_t0.none-task-blog-BlogCommendFromMachineLearnPai2-1.nonecase&depth_1-utm_source=distribute.pc_relevant_t0.none-task-blog-BlogCommendFromMachineLearnPai2-1.nonecase
 * 静态分派
 * https://blog.csdn.net/xyh930929/article/details/84067186?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.nonecase&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.nonecase
 */
public class StaticDispatch{

    public void getSize(Ocean waterArea){
        System.out.println("Ocean is the biggest!");
    }
    public void getSize(Lake waterArea){
        System.out.println("Lake is bigger!");
    }
    public void getSize(River waterArea){
        System.out.println("River is big...");
    }

    public static void main(String[] args) {
        StaticDispatch dispatch = new StaticDispatch();
        Ocean river = new River();
        Ocean lake = new Lake();
        dispatch.getSize(lake);
        dispatch.getSize(river);
    }
}
