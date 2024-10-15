package com.example.databindingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.example.databindingapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;

    private MyClickHandler myClickHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);

        activityMainBinding = DataBindingUtil.setContentView(
                this,
                R.layout.activity_main
        );

//        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(activityMainBinding.main, (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

//        Not recommended when using data binding
//        button = findViewById(R.id.btn_next);


        Person person = new Person(activityMainBinding);

        activityMainBinding.setPerson(person);

        activityMainBinding.buttonView.setOnClickListener(v->{
            Intent intent = new Intent(this,SecondActivity.class);
            Toast.makeText(this, "Button is clicked", Toast.LENGTH_SHORT).show();
            startActivity(intent);

        });




    }

}