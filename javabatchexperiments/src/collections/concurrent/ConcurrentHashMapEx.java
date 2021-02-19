package collections.concurrent;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.*;

public class ConcurrentHashMapEx {

    public static void main(String[]args){
        Map<Integer,String>hashMap=new HashMap<>();
        hashMap.put(1,"one");
        hashMap.put(2,"two");

        Map<Integer, String>table=new Hashtable<>();
        table.put(1,"one");
        table.put(2,"two");

        ConcurrentHashMap<Integer,String> concurrentHashMap=new ConcurrentHashMap<>();
        concurrentHashMap.put(1,"one");
        concurrentHashMap.put(2,"two");
        Set<Map.Entry<Integer,String>>entries=concurrentHashMap.entrySet();
        for (Map.Entry<Integer,String>entry:entries){
            entries.remove(entry);
        }

    }
}
