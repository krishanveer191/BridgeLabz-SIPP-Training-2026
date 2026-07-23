package com.Generics.comparing;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Student st1 = new Student(2,98.47);
        Student st2 = new Student(12,78.24);
        Student st3 = new Student(52,56.32);
        Student st4 = new Student(13,87.98);
        Student st5 = new Student(23,18.27);
        Student st6 = new Student(39,92.33);
        Student st7 = new Student(41,28.48);

        Student[] arr = {st1,st2,st3,st3,st4,st5,st6,st7};

        System.out.println(Arrays.toString(arr));


//        Arrays.sort(arr,(a,b)-> {
//            if(a.compareTo(b) < 0) return -1;
//            return 1;
//        });

        Arrays.sort(arr,(a,b)->(int)(a.rollNo-b.rollNo));


        System.out.println(Arrays.toString(arr));
    }
}
