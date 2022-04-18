package com.imooc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * iterator 性能最好
 * @author dhl
 */
public class TestMap {

    public static void main(String[] args) {


        Map map1 = inputMap();
        long startTime = System.currentTimeMillis();
        showMap1(map1);
        System.out.println("key set = " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        showMap2(map1);
        System.out.println("value  = " + (System.currentTimeMillis() - startTime));


        startTime = System.currentTimeMillis();
        showMap3(map1);
        System.out.println("entrySet  = " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        showMap4(map1);
        System.out.println("iterator  = " + (System.currentTimeMillis() - startTime));

    }

    /**
     * 遍历 key 少使用
     *
     * @param map
     */
    public static void showMap1(Map<String, Integer> map) {
        Integer value;
        for (String key : map.keySet()) {
            // System.out.println(" key = "+key +"::value = "+map.get(key));
            value = map.get(key);
        }

    }


    /**
     * 遍历 value
     *
     * @param map
     */
    public static void showMap2(Map<String, Integer> map) {
        Integer value;
        for (Integer v : map.values()) {
            //  System.out.println(value);
            value = v;
        }
    }


    /**
     * 遍历 entry
     *
     * @param map
     */
    public static void showMap3(Map<String, Integer> map) {
        Integer value;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            //System.out.println("key = "+entry.getKey()+":value"+entry.getValue());
            value = entry.getValue();
        }
    }

    /**
     * Iterator  遍历
     * 多使用
     *
     * @param map
     */
    public static void showMap4(Map<String, Integer> map) {
        Integer value;
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            // System.out.println("key = "+entry.getKey()+"::value ="+entry.getValue());
            value = entry.getValue();
        }
    }

    public static Map inputMap() {
        Map<String, Integer> userMap = new HashMap<>();
        String[] str = new String[]{"a", "b", "c", "d", "e", "f", "y", "u", "q", "h"};
        for (int i = 0; i < 5000000; i++) {
            int m = (int) (Math.random() * 10);
            userMap.put(str[m] + i * 100, i);
        }
//        userMap.put("zhangsan1",new Integer(2));
//        userMap.put("zhangsan2",new Integer(4));
//        userMap.put("zhangsan3",new Integer(1));
//        userMap.put("zhangsan4",new Integer(7));
//        userMap.put("zhangsan5",new Integer(3));
        return userMap;
    }


}
