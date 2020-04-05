package com.nguyenminhngan.hoccheckboxradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moManHinhRadioButton(View view) {
        Intent intent=new Intent(MainActivity.this,RadioButtonActivity.class);
        startActivity(intent);
    }

    public void moManHinhCheckBoxButton(View view) {
        Intent intent=new Intent(MainActivity.this,CheckBoxActivity.class);
        startActivity(intent);
    }
}
