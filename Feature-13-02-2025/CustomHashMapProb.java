import java.util.LinkedList;
class CustomHashMapProb<K, V> {
    private static final int SIZE = 10; 
    private LinkedList<Entry<K, V>>[] buckets; 
    public CustomHashMapProb() {
        buckets = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int getHash(K key) {
        return Math.abs(key.hashCode()) % SIZE;
    }

    public void put(K key, V value) {
        int index = getHash(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value; 
                return;
            }
        }
        bucket.add(new Entry<>(key, value)); 
    }

    public V get(K key) {
        int index = getHash(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value; 
            }
        }
        return null; 
    }
    public void remove(K key) {
        int index = getHash(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];

        bucket.removeIf(entry -> entry.key.equals(key));
    }

    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    public static void main(String[] args) {
        CustomHashMapProb<String, Integer> map = new CustomHashMapProb<>();
        map.put("Anuj", 21);
        map.put("Kunal", 22);
        map.put("Cheeti", 23);

        System.out.println("Anuj's Age: " + map.get("Anuj")); 
        map.remove("Anuuj");
        System.out.println("Anuj's Age after removal: " + map.get("Anuj")); 
    }
}