package com.company;

public class Student implements Comparable {

    public String name;
    public int mark;

    public Student (String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    @Override
    public int compareTo(Object o) {
        return -(mark - ((Student)o).mark);
    }

}