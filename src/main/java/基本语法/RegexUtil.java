package 基本语法;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description:
 * @author: 范子祺
 **/
public class RegexUtil {

    //邮箱正则
    public static final String REGEX_EMAIL = "^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$";

    //手机号
    public static final String REGEX_MOBILE = "1\\d{10}";

    //固话
    public static final String REGEX_PHONE = "^(\\+\\d{2}-)?0\\d{2,3}-\\d{7,8}$";

    //支持带“-”格式的手机号
    public static final String REGEX_MOBILE_2 = "1\\d{10}|1\\d{2}-\\d{4}-\\d{4}";

    //手机号和电话正则表达式
    public static final String REGEX_CONTACT_NUMBER = "(\\+86[\\s-]?)?(\\d{3,4}[\\s-]?\\d{3,4}[\\s-]?\\d{3,4})|(1\\d{10})|(([0,4,8]{3,4})-?)?\\d{7,10}(-?\\d{1,5})?";

    // 数字
    public static final String REGEX_NUMERIC = "[0-9]*";

    // 英文
    public static final String REGEX_ENGLISH = "[a-zA-Z]*";

    /**
     * 校验是否是固话
     *
     * @param str
     * @return
     */
    public static boolean isPhone(String str) {
        return is(str, REGEX_PHONE);
    }

    /**
     * 校验是否是联系方式
     *
     * @param str
     * @return
     */
    public static boolean isMobileOrPhone(String str) {
        return is(str, REGEX_CONTACT_NUMBER);
    }

    /**
     * 校验是否邮箱
     *
     * @param str
     * @return
     */
    public static boolean isEmail(String str) {
        return is(str, REGEX_EMAIL);
    }

    /**
     * 是否手机
     *
     * @param str
     * @return
     */
    public static boolean isMobile(String str) {
        return is(str, REGEX_MOBILE);
    }

    /**
     * 是否带"-"格式的手机
     *
     * @param str
     * @return
     */
    public static boolean isMobileHasCharacter(String str) {
        return is(str, REGEX_MOBILE_2);
    }

    /**
     * 是否为数字
     *
     * @param str
     * @return
     */
    public static boolean isNumeric(String str) {
        return is(str, REGEX_NUMERIC);
    }

    /**
     * 判断是否为符合条件
     *
     * @param str
     * @param regEx
     * @return
     */
    public static boolean is(String str, String regEx) {
        // 编译正则表达式
        Pattern pattern = Pattern.compile("^" + regEx + "$");
        // 忽略大小写的写法
        // Pattern pat = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        // 字符串是否与正则表达式相匹配
        return matcher.find();
    }

    /**
     * 是否为应为
     *
     * @param str
     * @return
     */
    public static boolean isEnglish(String str) {
        return is(str, REGEX_ENGLISH);
    }

    /**
     * 查找
     *
     * @param str
     * @param regEx
     * @return
     */
    public static String find(String str, String regEx) {
        // 编译正则表达式
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            return matcher.group(0);
        }
        return null;
    }

    public static void main(String[] args) {
        String str = "打发13112222222防守打法是分发";
//		String regEx = "((\\d{11})|((\\d{7,8})|(\\d{4}|\\d{3})-(\\d{7,8})-(\\d{4}|\\d{3}|\\d{2}|\\d{1})|(\\d{4}|\\d{3})-(\\d{7,8})|(\\d{7,8})-(\\d{4}|\\d{3}|\\d{2}|\\d{1})))";
        System.out.println(find(str, REGEX_CONTACT_NUMBER));
        System.out.println(isMobileHasCharacter("138-1333-4901"));

        String address = "1100-33333338";
        String telephone = RegexUtil.find(address, RegexUtil.REGEX_CONTACT_NUMBER);

        System.out.println(telephone);

    }
}


