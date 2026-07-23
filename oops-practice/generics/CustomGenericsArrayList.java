package com.Generics;

import java.util.Arrays;

public class CustomGenericsArrayList<T> {
    private Object[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericsArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if(usFull()) {
            resize();
        }
        data[size++] = num;
    }

    public T remove() {
        return (T)(data[--size]);
    }

    public T get(int index) {
        return (T)(data[index]);
    }

    public void set(int index,T value) {
        data[index] = value;
    }

    public int size() {
        return size;
    }

    private boolean usFull() {
        return size == data.length;
    };

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        for(int i = 0 ; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    @Override
    public String toString() {
        return "CustomGenericsArrayList{" +
                "data=" + Arrays.toString(data) +
                ", DEFAULT_SIZE=" + DEFAULT_SIZE +
                ", size=" + size +
                '}';
    }
}
