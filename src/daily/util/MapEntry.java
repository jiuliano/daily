package daily.util;

public class MapEntry<K,V> {
    public K key;
    public V value;
    public MapEntry prev;
    public MapEntry next;

    public MapEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
