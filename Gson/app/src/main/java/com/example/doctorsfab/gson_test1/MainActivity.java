package com.example.doctorsfab.gson_test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyBean myBean = new MyBean();
        myBean.temp();
        Log.d("###","|"+myBean.toJson());

        MyBean2 myBean2 = new MyBean2();
        Log.d("###","|"+myBean2.toJson());
    }
}
