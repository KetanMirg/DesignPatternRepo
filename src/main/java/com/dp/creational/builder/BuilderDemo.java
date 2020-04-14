package com.dp.creational.builder;

import java.util.Arrays;

public class BuilderDemo {

    public static void main(String[] args) {
        Phone phone = new Phone.PhoneBuilder().setName("Samsung").setModel("A50s").build();
        System.out.println(phone.toString());
    }
}
