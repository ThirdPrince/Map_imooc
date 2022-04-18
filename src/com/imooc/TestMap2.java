package com.imooc;

import java.util.HashMap;
import java.util.Map;

/**
 * hashmap 底层原理
 * new HashMap(3) 大于 3 的 2 最小N次方 4 长度不是3
 * 扩容的次数越少越好，初始化的大小要和业务相关
 * new HashMap(10000,0.75f) 要录入的数据有10000条，会产生扩容吗？
 *  解：2^14 = 16384 *0.75 = 12288 不会产生扩容
 * @author dhl
 */
public class TestMap2 {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap(); // =  Map<Integer,String> map = new HashMap(16,0.75)
        map.put(120,"a"); //120 % 16 = 8
        map.put(37,"a");  // 37 %16 = 5
        map.put(61,"a");  // 61 %16 = 13
        map.put(40,"a");  // 40% 16 = 8
        map.put(92,"a");  // 92 % 16 = 12
        map.put(78,"a");  // 78% 16 = 14
        System.out.println(map);
    }
}
