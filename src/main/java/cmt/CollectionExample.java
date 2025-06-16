package cmt;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class CollectionExample {

    public static void main(String[] args) {
//        Map<String, String> stringMap = new HashMap<>();
        Map<String,String> stringMap = new ConcurrentHashMap<>();
        stringMap.put("Marcus", "Java");
        stringMap.put("Mars", "JS");

//        Set<String> keys = new HashSet<>(stringMap.keySet());
//
//        for (String key : keys){
//            System.out.println(key + "codes in " + stringMap.get(key)) ;
//            stringMap.remove(key);
//        }
        for (String key : stringMap.keySet()){
           System.out.println(key + "codes in " + stringMap.get(key)) ;
           stringMap.remove(key);
       }
    }
}
