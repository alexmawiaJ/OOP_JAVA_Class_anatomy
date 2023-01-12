package com.example.class_anatomy;

public class Duck {

    //member variables
    private String name;
    private int lifeExpectancy;
    private String favoriteFood;

    public Duck(String name, int lifeExpectancy, String favoriteFood) {
        this.name = name;
        this.lifeExpectancy = lifeExpectancy;
        this.favoriteFood = favoriteFood;
    }

    //methods
    void waddle(){
        lifeExpectancy++;
        System.out.println(this.name + " owns waddle method");

    }

    void quack(){

    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", lifeExpectancy=" + lifeExpectancy +
                ", favoriteFood='" + favoriteFood + '\'' +
                '}';
    }
}
