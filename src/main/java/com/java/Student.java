package com.java;

public class Student {

    private String id;//表示学号
    private String name;//表示姓名
    private char sex;//表示性别
    private int age;//表示年龄
    private double computer_score;//表示计算机课程的成绩
    private double english_score;//表示英语课的成绩
    private double maths_score;//表示数学课的成绩
    private double total_score;// 表示总成绩
    private double ave_score; //表示平均成绩

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getComputer_score() {
        return computer_score;
    }

    public void setComputer_score(double computer_score) {
        this.computer_score = computer_score;
    }

    public double getEnglish_score() {
        return english_score;
    }

    public void setEnglish_score(double english_score) {
        this.english_score = english_score;
    }

    public double getMaths_score() {
        return maths_score;
    }

    public void setMaths_score(double maths_score) {
        this.maths_score = maths_score;
    }

    public double getTotal_score() {
        return total_score;
    }

    public void setTotal_score(double total_score) {
        this.total_score = total_score;
    }

    public double getAve_score() {
        return ave_score;
    }

    public void setAve_score(double ave_score) {
        this.ave_score = ave_score;
    }
}
