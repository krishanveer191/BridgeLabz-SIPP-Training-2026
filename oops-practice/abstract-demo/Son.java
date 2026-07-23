package com.abstractDemo;

public class Son extends Parent{

    Son() {
        this.nameCareer = nameCareer;
        this.namePartner = nameCareer;
    }

    Son(String career , String partner) {
        this.nameCareer = career;
        this.namePartner = partner;
    }

    @Override
    void career(String nameCareer) {
        System.out.println("I want to be a "+nameCareer);
    }

    @Override
    void partner(String namePartner) {
        System.out.println("I love my kaju katli "+namePartner);
    }

    @Override
    void career() {
        System.out.println("I want to be a "+nameCareer);
    }

    @Override
    void partner() {
        System.out.println("I love my kaju katli "+namePartner);
    }
}
