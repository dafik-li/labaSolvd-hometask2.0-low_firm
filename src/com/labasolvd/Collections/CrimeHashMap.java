package com.labasolvd.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;

public class CrimeHashMap {
    Map<String, Integer> crimeHashMap = new HashMap<>();

    public int size() {
        return crimeHashMap.size();
    }
    public boolean isEmpty() {
        return crimeHashMap.isEmpty();
    }
    public boolean containsKey(Object key) {
        return crimeHashMap.containsKey(key);
    }
    public boolean containsValue(Object value) {
        return crimeHashMap.containsValue(value);
    }
    public Integer get(Object key) {
        return crimeHashMap.get(key);
    }
    public Integer put(String key, Integer value) {
        return crimeHashMap.put(key, value);
    }
    public Integer remove(Object key) {
        return crimeHashMap.remove(key);
    }
    public void putAll(Map<? extends String, ? extends Integer> m) {
        crimeHashMap.putAll(m);
    }
    public void clear() {
        crimeHashMap.clear();
    }
    public Set<String> keySet() {
        return crimeHashMap.keySet();
    }
    public Set<Map.Entry<String, Integer>> entrySet() {
        return crimeHashMap.entrySet();
    }
    public Integer getOrDefault(Object key, Integer defaultValue) {
        return crimeHashMap.getOrDefault(key, defaultValue);
    }
    public void replaceAll(BiFunction<? super String, ? super Integer, ? extends Integer> function) {
        crimeHashMap.replaceAll(function);
    }
    public boolean remove(Object key, Object value) {
        return crimeHashMap.remove(key, value);
    }
    public boolean replace(String key, Integer oldValue, Integer newValue) {
        return crimeHashMap.replace(key, oldValue, newValue);
    }
    public Integer replace(String key, Integer value) {
        return crimeHashMap.replace(key, value);
    }
    public static <K, V> Map.Entry<K, V> entry(K k, V v) {
        return Map.entry(k, v);
    }
}
