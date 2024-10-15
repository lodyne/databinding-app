package com.example.databindingapp;

import android.view.View;
import android.widget.TextView;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.databindingapp.databinding.ActivityMainBinding;

public class Person extends BaseObservable {
    String firstName, secondName;

    ActivityMainBinding mainBinding;


    public Person(ActivityMainBinding mainBinding) {
        this.mainBinding = mainBinding;
    }

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    @Bindable
    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
        notifyPropertyChanged(BR.secondName);
    }

    public void showFullName(View view){
        String fullName = getFirstName() + " " +getSecondName();
        mainBinding.txt1.setText(fullName);

    }
}
