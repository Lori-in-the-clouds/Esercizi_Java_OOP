package oop.basic;

import java.util.Arrays;
import java.util.Deque;

public class EnhancedResizableArray {
    static final int DEFAULT_CAPACITY = 4;
    int v[];

    public EnhancedResizableArray() {
        this.v =new int[DEFAULT_CAPACITY];
    }

    public int get(int index) {
        return v[index];
    }

    public void set(int index, int value) {
        if (index >= v.length) {
            int[] tmp = new int[index*2];
            System.arraycopy(v,0,tmp,0,v.length);
            tmp[index] = value;
            v = tmp;
        }
        v[index] = value;
    }

    public boolean contains(int value) {
        for (int i : v) {
            if (i == value) return true;
        }
        return false;
    }

    public void fill(int t) {
        Arrays.fill(v,t);
    }
    public int length() {
        return v.length;
    }

    public int[] toArray() {
        return v;
    }

}
