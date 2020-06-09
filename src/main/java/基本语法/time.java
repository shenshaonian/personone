//package 基本语法;
//
//import org.junit.Test;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
///**
// * @description:
// * @author: 范子祺
// **/
//public class time {
//
//    @Test
//    public void test() {
//        String temp = Long.toString(System.currentTimeMillis(), 2);
//        System.out.println(System.currentTimeMillis());
//        System.out.println(temp);
//    }
//
//
//    public static int maxPhoneUserName(String userName, List<String> userNameList) {
//        List<String> listj = new ArrayList<String>();
//        for (int i = 0; i < userNameList.size(); i++) {
//            listj.add(userNameList.get(i).substring(userName.length()));
//        }
//        List<Integer> list = new ArrayList<Integer>();
//        for (int j = 0; j < listj.size(); j++) {
//            if (!DepponStringUtils.isEmpty(listj.get(j)) && RegexUtil.isNumeric(listj.get(j))) {
//                list.add(Integer.parseInt(listj.get(j)));
//            }
//        }
//        if (BeanUtil.isEmpty(list)) {
//            return 0;
//        }
//        return Collections.max(list);
//    }
//
//    public static void main(String[] args) {
//
//        String account = "sj186137775121";
//        List<String> listUserNAme = new ArrayList<>();
//        listUserNAme.add("sj186137775121");
//        int i = maxPhoneUserName(account, listUserNAme) + 5;
//
//        System.out.println(account + i);
//    }
//}
