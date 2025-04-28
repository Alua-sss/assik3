public class BST<K extends Comparable<K>, V> {
    private class Node {
        K key;
        V val;
        Node left, right;

        Node(K key, V val) {
            this.key = key;
            this.val = val;
        }
    }

    private Node root;
    private int size = 0;

    public void put(K key, V val) {
        if (root == null) {
            root = new Node(key, val);
            size++;
            return;
        }
        Node current = root;
        while (true) {
            if (key.compareTo(current.key) < 0) {
                if (current.left == null) {
                    current.left = new Node(key, val);
                    size++;
                    return;
                }
                current = current.left;
            } else if (key.compareTo(current.key) > 0) {
                if (current.right == null) {
                    current.right = new Node(key, val);
                    size++;
                    return;
                }
                current = current.right;
            } else {
                current.val = val;
                return;
            }
        }
    }

    public V get(K key) {
        Node current = root;
        while (current != null) {
            if (key.compareTo(current.key) < 0) current = current.left;
            else if (key.compareTo(current.key) > 0) current = current.right;
            else return current.val;
        }
        return null;
    }

    public int size() {
        return size;
    }
}
