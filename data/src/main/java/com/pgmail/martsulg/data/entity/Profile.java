package com.pgmail.martsulg.data.entity;


import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo on 16.08.2017.
 */

public class Profile implements DataModel {

    @SerializedName("name")
    private String name;
    @SerializedName("surname")
    private String surname;
    @SerializedName("age")
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
