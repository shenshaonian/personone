package 基本语法.枚举;

/**
 * @description:
 * @author: 范子祺
 **/
public class TestEm {
    public static void main(String[] args) {
        EmBussinessError e = EmBussinessError.PARAMETER_VALIDATION_ERROR;
        System.out.println(e.getErrorCode());
        System.out.println(e);
        System.out.println(e.getErrorMsg());
        System.out.println("枚举");
        System.out.println(EmBussinessError.STOCK_NOT_ENOUGH);
    }
}
