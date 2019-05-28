package com.gamecodeschool.caculatorapp2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
    public void onButtonClick(View v){
        EditText e1 =(EditText)findViewById(R.id.editText);
        EditText e2 =(EditText)findViewById(R.id.editText2);
        TextView t1= (TextView)findViewById(R.id.textView);
        int num1=Integer.parseInt(e1.getText().toString());
        int num2=Integer.parseInt(e2.getText().toString());
        int sum =num1+num2;
        t1.setText(Integer.toString(sum));
    }


}
