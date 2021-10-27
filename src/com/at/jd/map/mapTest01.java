package com.at.jd.map;

import org.junit.Test;

import java.util.*;

public class mapTest01 {

//    @Test
//    public void test1(){
//       Map<String, String> mpaTest = new HashMap<>();
//        mpaTest.put("11","星期一");
//        mpaTest.put("22","星期二");
//        mpaTest.put("33","星期三");
//        System.out.println("+++++++++++++++++++++++++++++++++++++");
//        System.out.println(mpaTest);
//        System.out.println("+++++++++++++++++++++++++++++++++++++");
//    }

    //        System.out.println("+++++++++++++++++++++++++++++++++++++");
//        System.out.println(mpaTest);
//        System.out.println("+++++++++++++++++++++++++++++++++++++");
    //containsKey   containsValue   get(Object k)
        /*
Set entrySet( )
返回此映射中包含的映射关系的 Set 视图。
Set keySet( )
返回此映射中包含的键的 Set 视图。
Collection values( )
返回此映射中包含的值的 Collection 视图。
//         */
//    @Test
//    public void test2(){
//        Map<String, String> mpaTest = new HashMap<>();
//        mpaTest.put("11","星期一");
//        mpaTest.put("22","星期二");
//        mpaTest.put("33","星期三");
//        Set<Map.Entry<String, String>> entries = mpaTest.entrySet();
//        Iterator<Map.Entry<String, String>> iterator1 = entries.iterator();
//        while (iterator1.hasNext()){
//            Map.Entry<String, String> next = iterator1.next();
//            String key = next.getKey();
//            String value = next.getValue();
//            System.out.println("key:"+key+"value:"+value);
//        }
//
//
//        Set<String> keys = mpaTest.keySet();
//        Collection<String> values = mpaTest.values();
//        for (String value : values) {
//            System.out.println("111"+value);
//        }
//        Iterator<String> iterator = values.iterator();
//        //iterator.hasNext() 判断是否还存在下一个元素
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//    }

    @Test
    public void test3(){
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("张三",1);
        map1.put("赵四",2);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("王五",3);
        map2.put("猴子",4);

        HashMap<String, HashMap<String, Integer>> map = new HashMap<>();
        map.put("基础",map1);
        map.put("高级",map2);
        Set<Map.Entry<String, HashMap<String, Integer>>> mapEntry = map.entrySet();
        Iterator<Map.Entry<String, HashMap<String, Integer>>> iterator = mapEntry.iterator();
        System.out.println("====================分割线====================");
        while (iterator.hasNext()) {
            Map.Entry<String, HashMap<String, Integer>> next = iterator.next();
            String key = next.getKey();
            HashMap<String, Integer> value = next.getValue();
            System.out.println("key: "+ key + " value: " + value);
        }
    }

}
