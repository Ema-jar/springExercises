package com.customBeans;

import org.springframework.stereotype.Service;

/**
 * Created by Emanuele on 27/12/2016.
 */
@Service
public class Person {

    private String name;
    private String lastName;
    private int id;

    public Person() {}

    @Override
    public String toString() {
        return "Person [" + this + "]{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }
}
