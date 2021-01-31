package com.company.Part2;

public class Student {
    private String name;
    private int id;
    public Student(int id, String name){
        this.id= id;
        this.name=name;
    }
    public String toString(){
        System.out.println("name: "+ this.getName()+", id: "+this.getId());
        return null;
    }

    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }
}
