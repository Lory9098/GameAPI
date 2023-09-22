package me.nettychannell.api.map;

import java.util.HashMap;
import java.util.stream.Stream;

public class GenericHashMap<K, V> {

    private HashMap<K, V> map = new HashMap<>();

    public void put(K key, V value) {
        this.map.put(key, value);
    }

    public V get(K key) {
        return this.map.get(key);
    }

    public void remove(K key) {
        this.map.remove(key);
    }

    public boolean containsKey(K key) {
        return this.map.containsKey(key);
    }

    public boolean containsValue(V value) {
        return this.map.containsValue(value);
    }

    public HashMap<K, V> getMap() {
        return map;
    }

    public void setMap(HashMap<K, V> map) {
        this.map = map;
    }

    public void clear() {
        this.map.clear();
    }

    public int size() {
        return this.map.size();
    }

    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    public void putAll(GenericHashMap<K, V> map) {
        this.map.putAll(map.getMap());
    }

    public void putAll(HashMap<K, V> map) {
        this.map.putAll(map);
    }

    public void replace(K key, V value) {
        this.map.replace(key, value);
    }

    public void replace(K key, V oldValue, V newValue) {
        this.map.replace(key, oldValue, newValue);
    }

    public Stream<K> keyStream() {
        return map.keySet().stream();
    }

    public Stream<V> valueStream() {
        return map.values().stream();
    }

    public Stream<HashMap.Entry<K, V>> entryStream() {
        return map.entrySet().stream();
    }

}
