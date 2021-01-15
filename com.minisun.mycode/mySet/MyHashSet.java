package mySet;

import java.util.ArrayList;

public class MyHashSet {

    boolean[] hashSet = null;


    public MyHashSet(){
        hashSet = new boolean[100000];
    }
    public void  add(int key){
        hashSet[key] = true;
    }
    public void remove(int key){
        hashSet[key] = false;
    }

    public boolean contains(int key){
        return hashSet[key];
    }
}
