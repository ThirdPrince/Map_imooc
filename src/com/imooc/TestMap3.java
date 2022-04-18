package com.imooc;

import java.util.HashMap;
import java.util.Map;

/**
 * 创建10个ashMap 每个HashMap 含有10万条记录
 * 传递不同的构造方法的参数 ，比较速度
 * 实验参数：构造方法(16,0.75) 和 (16384,0.75)
 */
public class TestMap3 {

    public static void main(String[] args) {
        Long sum = 0L;
        for (int i = 0;i<10;i++){
            sum += new TestMap3().inputMap1(10000,0.75f);
        }
        System.out.println("avg time = "+(sum/10));

    }

    public  Long inputMap1(int initialCapacity,float loadFactor){
        String key,value;
        Map<String,String> map = new HashMap<>(initialCapacity,loadFactor);
        Long startTime =  System.nanoTime();
        for(int i = 0;i<1000000;i++){
            key = String.valueOf(i);
            value = "value";
            map.put(key,value);
        }
        Long endTime = System.nanoTime();
        Long costTime = endTime - startTime;
        System.out.println("time = "+costTime);
        return costTime;
    }
}
