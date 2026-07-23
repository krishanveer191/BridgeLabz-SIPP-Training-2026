package com.Generics.comparing;

public class Student// implements Comparable<Student>
{
    int rollNo;
    double marks;

    public Student(int rollNo, double marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

//    @Override
//    public int compareTo(Student o) {
//        double diff = this.marks - o.marks;
//        if(diff < 0) return -1;
//        else if(diff > 0) return 1;
//        else return 0;
//    }

    @Override
    public String toString() {
        return rollNo +" , "+marks;
    }
}
