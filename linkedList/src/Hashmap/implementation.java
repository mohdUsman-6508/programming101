package Hashmap;

import java.util.Arrays;
import java.util.LinkedList;

public class implementation {
    //<> generic data
    static class MyHashmap<K, V> {
        public static final int DEFAULT_CAPACITY = 4;
        public static final float LOAD_FACTOR = 0.75f;

        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;//no.of entries in the map
        private LinkedList<Node>[] buckets;

        private void initBucket(int N) {//N capacity of bucket array

            buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

        }

        private int HashFunc(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % buckets.length;
        }

        public MyHashmap() {
            initBucket(DEFAULT_CAPACITY);
        }

        private int searchInBucket(LinkedList<Node> ll, K key) {
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i;
                }
            }

            return -1;
        }

        public int size() {//return no.of entries
            return n;
        }
        public int capacity(){
            return buckets.length;
        }

        public float load(){
            return (n*1.0f)/buckets.length;
        }

        private void rehash(){
            LinkedList<Node>[] oldbuckets=buckets;
            initBucket(oldbuckets.length*2);
            n=0;
            for (var bucket:oldbuckets){
                for (var node:bucket){
                    put(node.key,node.value);
                }
            }
        }
        public void put(K key, V value) { //insert/update
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);

            if (ei == -1) {//key does not exist
                Node node = new Node(key, value);
                currBucket.add(node);
                n++;

            } else {//update case

                Node currNode = currBucket.get(ei);
                currNode.value = value;

            }

            if(n>buckets.length*LOAD_FACTOR){
                rehash();
            }
        }

        public V get(K key) {
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if (ei != -1) {
                Node currNode = currBucket.get(ei);
                return currNode.value;
            }

            return null;
        }

        public V remove(K key) {
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if (ei != -1) {
                Node currNode = currBucket.get(ei);
                V val = currNode.value;
                currBucket.remove();
                n--;
                return val;
            }

            return null;
        }
    }

    public static void main(String[] args) {

        MyHashmap<String, Integer> m = new MyHashmap<>();
        System.out.println("testing put:");
        m.put("a", 10);
        m.put("b", 11);
        m.put("c", 12);
        m.put("d", 13);
        m.put("e", 14);
        System.out.println("testing size:" + m.size());
        m.put("e",23);
        System.out.println(m.size());

        System.out.println("testing get");
        System.out.println(m.get("e"));
        System.out.println(m.get("a"));
        System.out.println(m.get("v"));

        System.out.println("testing remove");

        m.remove("a");
        System.out.println(m.get("a")); m.put("c", 12);
        m.put("hd", 13);
        m.put("ej", 14);
        System.out.println(m.size());
        System.out.println(m.capacity()+" "+m.load());
    }
}
