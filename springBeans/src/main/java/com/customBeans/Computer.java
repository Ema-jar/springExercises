package com.customBeans;

/**
 * Created by Emanuele on 27/12/2016.
 */
public class Computer {

    private String seriesNumber;
    private String processor;
    private String price;

    public Computer(String seriesNumber, String processor, String price) {
        this.seriesNumber = seriesNumber;
        this.processor = processor;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Computer [" + this + "]{" +
                "seriesNumber='" + seriesNumber + '\'' +
                ", processor='" + processor + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
