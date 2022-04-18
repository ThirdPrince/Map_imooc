package com.imooc.common;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LRU cache
 * 最近最少使用算法
 * @author dhl
 */
public class LRUMap<K,V>extends LinkedHashMap<K,V> {

    private int maxSize;
    public LRUMap(int maxSize){
        super(16,0.75f,true);
        this.maxSize = maxSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > this.maxSize;
       // return super.removeEldestEntry(eldest);
    }
}
