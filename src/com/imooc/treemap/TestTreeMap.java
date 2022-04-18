package com.imooc.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * test tree map
 * 默认是按key 进行升序排序，如果按照降序，需要自定义比较器
 */
public class TestTreeMap {
    public static void main(String[] args) {

        Map<String,String> treeMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        treeMap.put("tx","88");
        treeMap.put("ax","88");
        treeMap.put("bx","88");
        treeMap.put("yx","88");
        treeMap.put("cx","88");
        treeMap.put("abx","88");
        treeMap.put("ox","88");
        System.out.println(treeMap);

    }
}
