package com.imooc;

import java.util.HashMap;
import java.util.Map;

/**
 * 1,putIfAbsent,put
 * 2,replace
 * 3,remove clear
 * 4,containsKey containsValue
 *  5.isEmpty
 */
public class TestMap4 {

    public static void main(String[] args) {

        // put ,remove .isEmpty
        Map<String,String> map = new HashMap<>();
        map.put("x","124");
        map.put("y","456");
        System.out.println(map);
        boolean isNull = map.isEmpty();
        System.out.println("map isNull = "+isNull);
        //map.remove("x");
        //map.clear();
        System.out.println(map);

        // containsKey
        boolean x = map.containsKey("x");
        boolean b = map.containsValue("456");
        System.out.println("x = "+x);
        System.out.println("b = "+b);

        //replace
        map.replace("x","333");
        String isValue = map.putIfAbsent("x","555");
        System.out.println(isValue);
        System.out.println(map);
    }
}
