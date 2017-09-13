package com.example.zack.zoo;


/**
 * Created by Zack on 9/12/2017.
 */

public class Animal {
    private String name;
    private double weight;
    private int age;
    private String category;
    private int viewType;

    public Animal(String name, double weight, int age, String category, int viewType) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.category = category;
        this.viewType = viewType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getViewType(){ return viewType;}

    public void setViewType(int viewType){this.viewType = viewType;}
}
