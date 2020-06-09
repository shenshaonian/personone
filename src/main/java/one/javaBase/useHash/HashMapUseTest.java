package one.javaBase.useHash;

import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.TreeMap;

/**
 * @description:
 * @author: 范子祺
 * @create: 2019-05-12 22:42
 **/
public class HashMapUseTest {
    @Test
    public void test() {
        HashMap hashMap = new HashMap();
        hashMap.put("a", "aaa");
        hashMap.put("a", "jijdf");
        hashMap.put("b", "bbb");
        hashMap.put("c", "ccc");
        hashMap.put("d", "ddd");
        hashMap.put("e", "eee");
        hashMap.put("f", "fff");
        hashMap.put("g", "ggg");
        hashMap.put("m", "mmm");
        Iterator iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println("hashmap(" + key + ") is :" + hashMap.get(key));
        }

        System.out.println();

        Hashtable hashtable = new Hashtable();
        hashtable.put("a", "aaa");
        hashtable.put("b", "bbb");
        hashtable.put("c", "ccc");
        hashtable.put("d", "ddd");
        hashtable.put("e", "eee");
        hashtable.put("f", "fff");
        hashtable.put("g", "ggg");
        hashtable.put("m", "mmm");
        Iterator iterator1 = hashtable.keySet().iterator();
        while (iterator1.hasNext()) {
            Object key = iterator1.next();
            System.out.println(hashtable.get(key));
        }

        System.out.println();

        TreeMap treeMap = new TreeMap();
        treeMap.put("a", "aaa");
        treeMap.put("b", "bbb");
        treeMap.put("c", "ccc");
        treeMap.put("d", "ddd");
        treeMap.put("e", "eee");
        treeMap.put("f", "fff");
        treeMap.put("g", "ggg");
        treeMap.put("m", "mmm");
        Iterator iterator2 = treeMap.keySet().iterator();
        while (iterator2.hasNext()) {
            Object key = iterator2.next();
            System.out.println(hashtable.get(key));
        }

    }
}
