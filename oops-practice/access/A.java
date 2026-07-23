package com.Access;

public class A {
    private int num;  // private (can be used with in the file only [to access outside the file use getter to get and setter to set])
    protected String str;      //protected (can be used within the pakage as well as in different pakages by inheritance.
    boolean access = false;  // default
    int[] arr;

//    when a variable in private we can't access that outside the file but if want to access it we've to make getter and to set value setter.
    public int getNum() {
        return num;
    };

    public void setNum(int num) {
        this.num = num;
    };

    public String showStr() {
        return str;
    };

    public boolean access() {
        return access;
    };

    public A() {
        this.num = num;
        this.str = str;
        this.access = access;
        this.arr = new int[num];
    }

    public A(int n , String s,boolean access) {
        this.access = access;
        this.num = n;
        this.str = s;
        this.arr = new int[n];
    };

}
