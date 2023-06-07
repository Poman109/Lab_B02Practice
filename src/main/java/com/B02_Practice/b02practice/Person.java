package com.B02_Practice.b02practice;

public class Person {
    String firstName;
    String lastName;
    String hkid;

    public Person(String firstName, String lastName, String hkid) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hkid = hkid;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getHkid() {
        return hkid;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setHkid(String hkid) {
        this.hkid = hkid;
    }
}
