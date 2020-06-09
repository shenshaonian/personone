package jdk8新特性.数据结构;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/**
 * @description:
 * @author: 范子祺
 **/
public class hashtable和hashmap {
    @Test
    public void test() {
        Hashtable<Object, Object> objectObjectHashtable = new Hashtable<>();

        HashMap<Object, Object> map = new HashMap<>();

        map.put("fa", 12);
        Iterator iter = map.entrySet().iterator();
        map.keySet();
        map.values();
        String key;
        Integer value;
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            key = (String) entry.getKey();
            value = (Integer) entry.getValue();
            System.out.println("key:" + key + ";value:" + value);
        }

//        ---------------------
//                版权声明：本文为CSDN博主「相由心生fhy」的原创文章，遵循CC 4.0 by-sa版权协议，转载请附上原文出处链接及本声明。
//        原文链接：https://blog.csdn.net/fhy569039351/article/details/82657776

        HashSet<String> set = new HashSet<String>();
        set.add("1");
        set.add("2");
        set.add("3");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }

    }
}
