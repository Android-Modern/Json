package com.example.doctorsfab.gson_test1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.Date;

public class MyBean {

    public String name;
    public int type;
    public long createdAt;
    public Date date;
    public ArrayList<String> strs = new ArrayList<>();
    public int[] integers = {11, 12, 222};

    public void temp(){

        name = "name";
        type = 23;
        createdAt = System.currentTimeMillis();
    }

    public String toJson(){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(this);

    }


}
