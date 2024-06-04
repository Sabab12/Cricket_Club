package com.bgmea.cricket_club;

public class Batsman extends  players{
    String  BR,SR,total_run,six_four;

    public Batsman(String name, String DOB, String DOJ, String pass, int age, String BR, String SR, String total_run, String six_four) {
        super(name, DOB, DOJ,  age);
        this.BR = BR;
        this.SR = SR;
        this.total_run = total_run;
        this.six_four = six_four;
    }

    public Batsman(String name, String DOB, String DOJ, String pass, int age) {
        super(name, DOB, DOJ,  age);
    }

    public String getBR() {
        return BR;
    }

    public void setBR(String BR) {
        this.BR = BR;
    }

    public String getSR() {
        return SR;
    }

    public void setSR(String SR) {
        this.SR = SR;
    }

    public String getTotal_run() {
        return total_run;
    }

    public void setTotal_run(String total_run) {
        this.total_run = total_run;
    }

    public String getSix_four() {
        return six_four;
    }

    public void setSix_four(String six_four) {
        this.six_four = six_four;
    }

    @Override
    public String toString() {
        return  ", name='" + name + '\''
                 +
                ", DOB='" + DOB + '\''
                +
                ", DOJ='" + DOJ + '\''
                +
                ", age=" + age+
                 "BR='" + BR + '\''
                +
                ", SR='" + SR + '\''
                +
                ", total_run='" + total_run + '\''
                +
                ", six_four='" + six_four + '\''

                ;
    }
}
