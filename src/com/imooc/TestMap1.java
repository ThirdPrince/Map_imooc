package com.imooc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMap1 {
    public static void main(String[] args) {

        Map<String,Map> map = new HashMap<>();
        Map<String,String> stu1 = new HashMap<>();
        stu1.put("yuwen","80");
        stu1.put("shuxue","60");
        stu1.put("lisi","72");

        Map<String,String> stu2 = new HashMap<>();
        stu2.put("yuwen","23");
        stu2.put("shuxue","60");
        stu2.put("lisi","72");


        Map<String,String> stu3 = new HashMap<>();
        stu3.put("yuwen","84");
        stu3.put("shuxue","64");
        stu3.put("lisi","72");

        Map<String,String> stu4 = new HashMap<>();
        stu4.put("yuwen","86");
        stu4.put("shuxue","70");
        stu4.put("lisi","82");


        Map<String,String> stu5 = new HashMap<>();
        stu1.put("yuwen","80");
        stu1.put("shuxue","60");
        stu1.put("lisi","72");


        map.put("zhang1",stu1);
        map.put("zhang2",stu2);
        map.put("zhang3",stu3);
        map.put("zhang4",stu4);
        map.put("zhang5",stu5);

        List<Map<String,String>> list = new ArrayList();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        list.add(stu5);
        System.out.println(list);


    }
}
