package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Person i = new Person("S", "B");
        String json=new Gson().toJson(i);
        System.out.println(json);
    }
}