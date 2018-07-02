package com.example.doctorsfab.gson_test1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MyBean2 {
    String a="1";
    String b="2";
    String c="3";
    String d="4";
    String e="5";

    public String toJson(){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(this);

    }
}
