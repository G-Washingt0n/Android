package com.pgmail.martsulg.testapplication.AtHome.DZ7;

/**
 * Created by lenovo on 18.08.2017.
 */

public class User {
    public final String firstName;
    public final String lastName;
    public final int age;
    public final String gender;

    public User(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}


