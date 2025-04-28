# Assignment 3 - HashTable and BST 

## Overview
This project implements two main data structures in Java:
- A custom `MyHashTable<K, V>`
- A custom `BST<K, V>`

The solution fully satisfies the assignment requirements:
- No recursion is used.
- 10,000 elements are inserted into the hash table.
- Bucket distribution is analyzed.
- Proper hashCode and equals methods are written manually.

---

## Project Structure

- `Student.java`  
  Simple class that stores student's `name` and `age`.

- `MyTestingClass.java`  
  A key class used in the hash table.  
  Custom `hashCode()` and `equals()` methods are provided.

- `MyHashTable<K, V>.java`  
  Custom generic Hash Table implementation.
  - Insert, Get, Remove methods are done using iteration (no recursion).
  - Buckets are handled with linked lists (chaining).
  - Collision handling is done by chaining method.

- `BST<K, V>.java`  
  Custom Binary Search Tree.
  - `put`, `get`, `delete` methods implemented using iterative approach only (no recursion).

- `Main.java`  
  - Fills the hash table with 10,000 random elements.
  - Prints the number of elements in each bucket.
  - Demonstrates correct balancing and distribution of data.

---

## How it Works

- A `MyHashTable<MyTestingClass, Student>` is created.
- A loop inserts 10,000 elements:
  - Keys: instances of `MyTestingClass`
  - Values: instances of `Student`
- After insertion, for each bucket, the number of elements is printed.
- Bucket balancing is visually inspected.

---

## Key Features

- No recursion is used anywhere.
- Custom hashCode logic.
- LinkedList-based chaining for collision handling.
- Iterative traversal in HashTable and BST.
- Full compatibility with Java Generics (`<K, V>`).

---

## Example Output

