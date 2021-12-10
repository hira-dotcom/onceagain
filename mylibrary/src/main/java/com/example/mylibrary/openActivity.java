package com.example.mylibrary;

import android.content.Context;
import android.content.Intent;

public class openActivity {
    public static void myactivity(Context c){

        Intent intent = new Intent(c, addition.class);
        c.startActivity(intent);
    }
}
