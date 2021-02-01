package com.company;

import com.company.Part1.part1;
import com.company.Part2.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*part1 p1= new part1();
        p1.part1();*/

        MyArrayList<Student> mal = new MyArrayList<>();
        mal.insertFirst(new Student(1, "John"));
        mal.insertFirst(new Student(2, "Mary"));
        mal.insertLast(new Student(3, "Mike"));
        mal.show();
        mal.deleteLast();
        mal.show();
        mal.deleteFirst();
        mal.show();
    }
}