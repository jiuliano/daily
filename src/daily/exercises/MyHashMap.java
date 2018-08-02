package daily.exercises;

import daily.util.MapEntry;

/**
 * Created by james on 1/19/2017.
 */
public class MyHashMap<K,V> {
    MapEntry<K,V> map[];

    public MyHashMap(int size) {
        map = new MapEntry[size];
    }

    public void put(K key, V value) {
        // TODO
    }

    public V get(K key) {
        MapEntry<K,V> entry = getEntry(key);
        return entry != null ? entry.value : null;
    }

    public V remove(K key) {
        MapEntry<K,V> entry = getEntry(key);
		
        // TODO

        return entry != null ? entry.value : null;
    }
	
	private int getIndex(K key) {
		// TODO return an appropriate value
		return 0;
	}

	private MapEntry<K,V> getEntry(K key) {
	    int idx = getIndex(key);
		MapEntry<K,V> entry = map[idx];
		
        // TODO

		return entry;
	}
}
