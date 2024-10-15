package com.example.databindingapp;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class MyClickHandler {
    Context context;

    public MyClickHandler(Context context) {
        this.context = context;
    }

    public void onClickedButton(View view){
        Toast.makeText(context, "Button is clicked", Toast.LENGTH_SHORT).show();
    }
}
