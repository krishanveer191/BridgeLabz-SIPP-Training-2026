package com.abstractDemo;

public class Daughter extends Parent {

    Daughter() {
        this.nameCareer = nameCareer;
        this.namePartner = nameCareer;
    }

    Daughter(String career , String partner) {
        this.nameCareer = career;
        this.namePartner = partner;
    }

    @Override
    void career(String name) {
        System.out.println("I want to be a "+name);
    }

    @Override
    void partner(String name) {
        System.out.println("I love my gulab jamun "+name);
    }

    @Override
    void career() {
        System.out.println("I want to be a "+nameCareer);
    }

    @Override
    void partner() {
        System.out.println("I love my gulab jamun "+namePartner);
    }
}
