package com.Generics;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if(usFull()) {
            resize();
        }
        data[size++] = num;
    }

    public int remove() {
        return data[--size];
    }

    public int get(int index) {
        return data[index];
    }

    public void set(int index,int value) {
        data[index] = value;
    }

    public int size() {
        return size;
    }

    private boolean usFull() {
        return size == data.length;
    };

    private void resize() {
        int[] temp = new int[data.length * 2];

        for(int i = 0 ; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", DEFAULT_SIZE=" + DEFAULT_SIZE +
                ", size=" + size +
                '}';
    }
}
