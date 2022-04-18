package com.imooc.linkedmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestLinkedHashMap2 {

    public static void main(String[] args) {

        Map<String,String> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);

        linkedHashMap.put("y1","xx");
        linkedHashMap.put("m1","xx");
        linkedHashMap.put("k1","xx");
        linkedHashMap.put("n1","xx");
        linkedHashMap.get("m1");
        linkedHashMap.get("k1");
        System.out.println(linkedHashMap);


    }
}
