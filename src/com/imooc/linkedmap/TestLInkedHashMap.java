package com.imooc.linkedmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 分别给HashMap 和LinkedHashMap 以录入1百万数据，并循环遍历，观察耗时
 * 录入 LinkedMap 更省时
 * 都采用不带参的空构造方法
 * 数量不大的情况 LinkedHashMap存数据 性能优于HashMap，数量大的情况，反之
 *
 *
 * @author dhl
 */
public class TestLInkedHashMap {

    public static void main(String[] args) {
        int count = 1000000;
        Map<String, String> map = new HashMap<>();
        Map<String, String> linkedMap = new LinkedHashMap<>();
        Map<String,String> treeMap =new TreeMap<>();
        Long start, end;
        start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            map.put(String.valueOf(i), "value");
        }
        end = System.currentTimeMillis();

        System.out.println("map  cost time = " + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            linkedMap.put(String.valueOf(i), "value");
        }
        end = System.currentTimeMillis();

        System.out.println("linked map cost time = " + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            treeMap.put(String.valueOf(i), "value");
        }
        end = System.currentTimeMillis();
        System.out.println("tree map cost time = " + (end - start));

        start = System.currentTimeMillis();
        for (String v : map.values()) {

        }
        end = System.currentTimeMillis();
        System.out.println("map  cost time = " + (end - start));

        start = System.currentTimeMillis();
        for (String v : linkedMap.values()) {
        }
        end = System.currentTimeMillis();
        System.out.println("linked map  cost time = " + (end - start));

        start = System.currentTimeMillis();
        for (String v : treeMap.values()) {
        }
        end = System.currentTimeMillis();
        System.out.println("tree map  cost time = " + (end - start));
    }
}


