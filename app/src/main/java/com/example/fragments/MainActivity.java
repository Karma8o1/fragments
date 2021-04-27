package com.example.fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn1:
                Fragment1 fragment1 = new Fragment1();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.container,fragment1);
                transaction.commit();
                break;
            case R.id.btn2:

                Fragment2 fragment = new Fragment2();
                FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
                trans.replace(R.id.container,fragment);
                trans.commit();
                break;
        }
    }
}