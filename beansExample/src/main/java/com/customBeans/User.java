package com.customBeans;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by Emanuele on 26/12/2016.
 */

@Component
public class User {

    private String name;
    private String lastName;

    public User() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User [" + this + "]{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
