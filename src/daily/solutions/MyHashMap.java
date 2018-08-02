package daily.solutions;

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
		MapEntry entry = getEntry(key);

		if ( entry != null ) {
			entry.value = value;
		} else {
			int idx = getIndex(key);

			entry = new MapEntry(key, value);
			entry.next = map[idx];
			map[idx] = entry;
		}
	}

	public V get(K key) {
		MapEntry<K,V> entry = getEntry(key);
		return entry != null ? entry.value : null;
	}

	public V remove(K key) {
		MapEntry<K,V> entry = getEntry(key);

		if ( entry != null) {
			int idx = getIndex(key);

			if ( entry == map[idx] ) {
				map[idx] = map[idx].next;
			} else {
				MapEntry pentry = map[idx];

				while ( pentry != null ) {
					if ( pentry.next == entry ) break;
					pentry = pentry.next;
				}

				pentry.next = entry.next;
			}
		}

		return entry != null ? entry.value : null;
	}

	private int getIndex(K key) {
		return Math.abs(key.hashCode()) % map.length;
	}

	private MapEntry<K,V> getEntry(K key) {
		int idx = getIndex(key);
		MapEntry entry = map[idx];

		while ( entry != null ) {
			if ( entry.key.equals(key) ) break;
			entry = entry.next;
		}

		return entry;
	}
}
