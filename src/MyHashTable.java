import java.util.LinkedList;

public class MyHashTable<K, V> {
    private class HashNode<K, V> {
        K key;
        V value;
        HashNode<K, V> next;

        public HashNode(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<HashNode<K, V>>[] chainArray;
    private int M = 11;
    private int size;

    public MyHashTable() {
        chainArray = new LinkedList[M];
        for (int i = 0; i < M; i++) {
            chainArray[i] = new LinkedList<>();
        }
    }

    public MyHashTable(int M) {
        this.M = M;
        chainArray = new LinkedList[M];
        for (int i = 0; i < M; i++) {
            chainArray[i] = new LinkedList<>();
        }
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % M;
    }

    public void put(K key, V value) {
        int index = hash(key);
        for (HashNode<K, V> node : chainArray[index]) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }
        chainArray[index].add(new HashNode<>(key, value));
        size++;
    }

    public V get(K key) {
        int index = hash(key);
        for (HashNode<K, V> node : chainArray[index]) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }

    public V remove(K key) {
        int index = hash(key);
        for (HashNode<K, V> node : chainArray[index]) {
            if (node.key.equals(key)) {
                V value = node.value;
                chainArray[index].remove(node);
                size--;
                return value;
            }
        }
        return null;
    }

    public boolean contains(V value) {
        for (LinkedList<HashNode<K, V>> bucket : chainArray) {
            for (HashNode<K, V> node : bucket) {
                if (node.value.equals(value)) return true;
            }
        }
        return false;
    }

    public int getTableSize() {
        return M;
    }

    public int getBucketSize(int index) {
        return chainArray[index].size();
    }
}
