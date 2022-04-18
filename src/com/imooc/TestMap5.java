package com.imooc;

import java.util.HashMap;
import java.util.Map;

/**
 * 1 map.foreach((key,value)->System.out.println(key+":"+value));
 * lamaba 表达式:->
 * 2,getOrDefault(key,defaultValue)
 */
public class TestMap5 {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(new Integer(120),"a");
        map.put(new Integer(37),"a");
        map.put(new Integer(61),"a");
        map.put(new Integer(40),"a");
        map.put(new Integer(92),"a");
        map.put(new Integer(78),"a");

        map.forEach((key,value)-> {
            System.out.println("key="+key+"::value="+value);
        });

        String value = map.getOrDefault(78, "b");
        System.out.println("value = "+value);


    }
}
