package com.bgmea.cricket_club;

public class Bowlar extends players{
    String total_wc,economy;

    public Bowlar(String name, String DOB, String DOJ, int age, String total_wc, String economy) {
        super(name, DOB, DOJ, age);
        this.total_wc = total_wc;
        this.economy = economy;
    }

    public String getTotal_wc() {
        return total_wc;
    }

    public void setTotal_wc(String total_wc) {
        this.total_wc = total_wc;
    }

    public String getEconomy() {
        return economy;
    }

    public void setEconomy(String economy) {
        this.economy = economy;
    }

    public Bowlar(String name, String DOB, String DOJ, int age) {
        super(name, DOB, DOJ, age);
    }

    @Override
    public String toString() {
        return  ", name='" + name + '\'' +
                ", DOB='" + DOB + '\'' +
                ", DOJ='" + DOJ + '\'' +
                ", age=" + age  +
                  "total_wc='" + total_wc + '\'' +
                ", economy='" + economy + '\'' ;

    }
}
