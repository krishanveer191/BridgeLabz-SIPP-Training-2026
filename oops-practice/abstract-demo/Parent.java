package com.abstractDemo;

public abstract class Parent {

    String nameCareer;
    String namePartner;

    public Parent() {
        this.nameCareer = nameCareer;
        this.namePartner = namePartner;
    }

    public Parent(String career, String partner) {
        this.nameCareer = nameCareer;
        this.namePartner = namePartner;
    }

    abstract void career(String name);
    abstract void partner(String name);
    abstract void career();
    abstract void partner();

}
