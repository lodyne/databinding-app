package com.example.databindingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.databindingapp.databinding.ActivityMainBinding;
import com.example.databindingapp.databinding.ActivityViewBindingBinding;

public class ViewBindingActivity extends AppCompatActivity {

    private ActivityViewBindingBinding activityViewBinding;

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        activityViewBinding = ActivityViewBindingBinding.inflate(getLayoutInflater());
        setContentView(activityViewBinding.getRoot());


        ViewCompat.setOnApplyWindowInsetsListener(activityViewBinding.main, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



        activityViewBinding.txtView1.setText("Komasava");
        activityViewBinding.txtView2.setText("Habari gani");
        activityViewBinding.txtView3.setText("Namaste");

        activityViewBinding.btnNow.setText("Bonyeza Hapa");


        activityViewBinding.btn11.setOnClickListener(v->{
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        });



    }
}