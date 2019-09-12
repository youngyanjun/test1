package com.java;

public class SortBean {
    private String name;
    private int age;
    private int userId;

    public SortBean(String name, int age, int userId) {
        this.name = name;
        this.age = age;
        this.userId = userId;
    }

    public String getName() { return name; }
    public void setName(String name) {this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
}
