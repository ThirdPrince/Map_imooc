package com.imooc.linkedmap;

import com.imooc.common.LRUMap;

import java.util.Map;

/**
 * LRU  test
 */
public class TestLRUMap {

    public static void main(String[] args) {

        Map<String,String> lruMap = new LRUMap<>(3);
        lruMap.put("x1","00");
        lruMap.put("x2","00");
        lruMap.put("x3","00");
        lruMap.get("x1");
        lruMap.put("x4","00");
       // lruMap.put("x5","00");
        System.out.println(lruMap);

    }
}
