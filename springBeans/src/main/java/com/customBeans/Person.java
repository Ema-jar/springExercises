package com.customBeans;

/**
 * Created by Emanuele on 27/12/2016.
 */
public class Person {

    private String name;
    private String lastName;
    private int id;

    public Person(String name, String lastName, int id) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person [" + this + "]{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }
}
