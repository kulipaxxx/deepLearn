package com.codeC.hash;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: sampleHashMap
 * @Author cheng
 * @Date: 2023/3/20 21:27
 * @Version 1.0
 */
public class simpleHashMap {
    static HashMap<Integer, String> map = new HashMap<>();
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        map.put(1,"a");
        list.add("adc");
        list.add("mid");
        list.add("ac");
        list.add("ace");
        list.add("gap");

        //要存放的数组
        String[] Map = new String[8];
        for (String s : list) {
            int index = s.hashCode() & (Map.length - 1); //计算索引位置
            System.out.println(String.format("key值%s, Idx%s", s, index));
            if(null == Map[index]) {//第一次插入
                Map[index] = s;
                continue;
            }
            //如果出现hash冲突则，模拟链表
            Map[index] = Map[index] + "->" + s;
        }
        System.out.println(JSON.toJSON(Map));
    }
}
