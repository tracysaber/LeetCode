import java.util.*;

/**
 * Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and put.

 get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
 put(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.

 Follow up:
 Could you do both operations in O(1) time complexity?

 Example:

 LRUCache cache = new LRUCache( 2  capacity );

		cache.put(1, 1);
		cache.put(2, 2);
		cache.get(1);       // returns 1
		cache.put(3, 3);    // evicts key 2
		cache.get(2);       // returns -1 (not found)
		cache.put(4, 4);    // evicts key 1
		cache.get(1);       // returns -1 (not found)
		cache.get(3);       // returns 3
		cache.get(4);       // returns 4
 */
class LRUCache {
	int size;
	HashMap<Integer,Integer> elements ;
	List<Integer> lru;
	public LRUCache(int capacity) {
		size = capacity;
		elements = new HashMap<Integer, Integer>();
		lru = new LinkedList<Integer>();
	}

	public int get(int key) {
		if(elements.containsKey(key)){
			lru.remove((Integer)key);
		}
		return 0;
	}

	public void put(int key, int value) {
		elements.put(key,value);
		if(elements.size()>size){

		}
		if(lru.contains(key)) lru.remove((Integer) key);
		lru.add(key);

	}
}
public class Leet_146 {

}
