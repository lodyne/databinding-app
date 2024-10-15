package com.example.databindingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    EditText editText1,editText2;

    TextView textView;

    Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        editText1 = findViewById(R.id.editText11);
        editText2 = findViewById(R.id.editText12);
        textView = findViewById(R.id.txtView);
        button1 = findViewById(R.id.button11);
        button2 = findViewById(R.id.btn_previous);
        button3 = findViewById(R.id.btn_next);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fname = editText1.getText().toString();
                String sname = editText2.getText().toString();
                String fullname = getFullname(fname,sname);
                textView.setText(fullname);
            }
        });

        button2.setOnClickListener(v->{
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });

        button3.setOnClickListener(v->{
            Intent intent = new Intent(this, ViewBindingActivity.class);
            startActivity(intent);
        });
    }

    public String getFullname(String fname,String sname){
        return fname+ " "+sname;

    }
}