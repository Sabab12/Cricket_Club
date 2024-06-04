package com.bgmea.cricket_club;

public class players {
    String name,DOB,DOJ;
    int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getDOJ() {
        return DOJ;
    }

    public void setDOJ(String DOJ) {
        this.DOJ = DOJ;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "players{" +
                "name='" + name + '\'' +
                ", DOB='" + DOB + '\'' +
                ", DOJ='" + DOJ + '\'' +
                ", age=" + age +
                '}';
    }

    public players(String name, String DOB, String DOJ, int age) {
        this.name = name;
        this.DOB = DOB;
        this.DOJ = DOJ;
        this.age = age;
    }
}




