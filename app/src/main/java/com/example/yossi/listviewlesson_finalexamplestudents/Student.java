package com.example.yossi.listviewlesson_finalexamplestudents;

public class Student {

    String name,id;
    int mat,eng,cpu;
    double avg;

    public Student(String name, String id, int mat, int eng, int cpu, double avg) {
        this.name = name;
        this.id = id;
        this.mat = mat;
        this.eng = eng;
        this.cpu = cpu;
        this.avg = avg;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getMat() {
        return mat;
    }

    public int getEng() {
        return eng;
    }

    public int getCpu() {
        return cpu;
    }

    public double getAvg() {
        return avg;
    }

    public void calculateAvg()
    {
        avg = (mat + eng + cpu)/3.0;
    }


}
