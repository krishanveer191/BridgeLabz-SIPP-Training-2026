package com.staticExample;

public class Main {
    public static void main(String[] args) {
        Human nitesh = new Human(20,"Nitesh",1_000_000_000,false);
        Human ashu = new Human(21,"Ashu",1_000_000_000,false);
        Human ironMan = new Human(200,"Tony Stark",99,true);
        Human thor = new Human(20,"Chris Hemsworth",1,false);

        System.out.println(Human.population);
    }
}
