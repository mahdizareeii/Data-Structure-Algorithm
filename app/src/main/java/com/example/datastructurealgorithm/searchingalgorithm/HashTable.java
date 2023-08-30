package com.example.datastructurealgorithm.searchingalgorithm;

class HashTable {
    private final int TABLE_SIZE;
    private String[] table;

    public HashTable(int size) {
        TABLE_SIZE = size;
        table = new String[TABLE_SIZE];
    }

    // Hash function to generate an index for the given key
    private int hashFunction(int key) {
        return key % TABLE_SIZE;
    }

    // Insert a key-value pair into the hash table
    public void insert(int key, String value) {
        int index = hashFunction(key);
        table[index] = value;
    }

    // Search for a value using the given key
    public String search(int key) {
        int index = hashFunction(key);
        return table[index];
    }

    // Test hash table
    private void test() {
        HashTable hashTable = new HashTable(10);

        // Insert some key-value pairs into the hash table
        hashTable.insert(15, "Alice");
        hashTable.insert(25, "Bob");
        hashTable.insert(35, "Charlie");
        hashTable.insert(12, "David");
        hashTable.insert(22, "Eva");

        int keyToSearch = 35;

        // Search for a value using the given key
        String foundValue = hashTable.search(keyToSearch);

        if (foundValue != null) {
            System.out.println("Value found: " + foundValue);
        } else {
            System.out.println("Value not found.");
        }
    }
}