public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>(103); // көбірек бакеттер болсын

        for (int i = 0; i < 10000; i++) {
            MyTestingClass key = new MyTestingClass(i);
            Student value = new Student("Student" + i, 18 + (i % 5));
            table.put(key, value);
        }

        for (int i = 0; i < table.getTableSize(); i++) {
            System.out.println("Bucket " + i + ": " + table.getBucketSize(i) + " elements");
        }
    }
}
