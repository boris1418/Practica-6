package com.company;


public class Main {

    public static void main(String[] args) {

        Student arr1[] = new Student[20];
        for (int i = 0; i < 20; ++i) {
            arr1[i] = new Student("Name" + i, i * i - 2 * i - 23);
        }

        Student arr2[] = new Student[40];
        for (int i = 0; i < 40; ++i) {
            arr2[i] = new Student("Name" + i, i * i - 2 * i * i * i + 44);
        }

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.insertionSort(arr1);
        sorter.quickSort(arr2);

        Student result[] = new Student[arr1.length + arr2.length];
        sorter.mergeLists(result, arr1, arr2);

        for (Student student : result) {
            System.out.println(student.name + " " + student.mark);
        }

    }

}

