package com.Access;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        A obj = new A(43,"nitesh",true);
        int[] arr = obj.arr;

        for(int i = 0 ; i < arr.length;i++) {
            obj.arr[i] = i;
        }

        System.out.println(Arrays.toString(arr));

        System.out.println(obj.getNum());
        obj.setNum(100);
        System.out.println(obj.getNum());

        System.out.println(obj.str);
        System.out.println(obj.access);
    }
}
