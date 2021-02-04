package com.company.Part2;

public class part2 {
    public static void part2(){
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
