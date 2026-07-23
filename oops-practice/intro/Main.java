package com.intro;

import com.Access.A;

class Student extends A {
    String name;
    int rollNo;
    double marks;

    void greeting() {
        System.out.println("Hello my name is "+ name);
    }

    Student () {
        super();
        this.name = "Nitesh";
        this.rollNo = 39;
        this.marks = 98;
    }

    Student(String name, int rollNo,double marks) {
        super();
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }


    Student(Student other) {
        super();
        this.name = other.name;
        this.rollNo = other.rollNo;
        this.marks = other.marks;
    }

    void show() {
        System.out.println("by class Student "+str);
    }

    void changeName(String newName) {
        this.name = newName;
    }
}

public class Main {

    public static void main(String[] args) {

//        Student stu1 = new Student();
//        Student stu2 = new Student("Ashu",02,99);
//        Student frontend = new Student(stu2);
//        Student backend = new Student(stu1);
//
//        System.out.println(stu1.name);
//        System.out.println(stu2.name);
//        System.out.println(frontend.name);
//        System.out.println(backend.name);
//
//        System.out.println("-------------------------------------------------");
//
//        Student me = stu1;

//        System.out.println(stu1.name);
//        System.out.println(me.name);
//        me.name = "paandaa";
//        System.out.println(stu1.name);
//        System.out.println(me .name);

        Student obj = new Student();

        A objA = new A(39,"nitesh",true);

//        System.out.println(obj.num); // can not access due to private
        //to access use getter
        System.out.println("by class Student "+obj.getNum());

//        System.out.println(obj.access); //access is dafault can not be accessed outside the pakage

//        System.out.println(obj.name); // can not access bacause the name is protected. so can be accessed by ony in subclass , as the show mehtode in the subclass can access it.
        obj.show();

        System.out.println(objA.getNum()); //private getter
        System.out.println(objA.showStr()); //protected getter
        System.out.println(objA.access()); //default getter



    }
}
