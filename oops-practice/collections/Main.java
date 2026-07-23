package com.Colllections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> lst1 = new ArrayList<>();
        lst1.add(2);
        lst1.add(4);
        lst1.add(1);
        lst1.add(0);

        System.out.println(lst1);

        List<Integer> lst2 = new LinkedList<>();
        lst2.add(34);
        lst2.add(23);
        lst2.add(9);
        lst2.add(4);
        System.out.println(lst2);

        List<Integer> lst3 = new Vector<>(); // same as arraylist but it is syncronized.
        lst3.add(21);
        lst3.add(14);
        lst3.add(12);
        lst3.add(40);

        System.out.println(lst3);

        enum Week {
            Sunday,Monday,Tuesday,Wednesday,Friday,Saturday,Codeday

            //these are emum constants.
            //public,static,final
            // since it is final you can not create it's child
            //type is Week
        }

        Week week;
        week = Week.Monday;

        System.out.println(week);

        for(Week day : Week.values()) {
            System.out.println(day);
        }

    }
}
