package com.example.mynjau;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class SingIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_in);
    }
    public void sign_up(View view){
        String username = ((EditText)findViewById(R.id.username)).getText().toString();
        String password = ((EditText)findViewById(R.id.password)).getText().toString();
        String uuid = ((EditText)findViewById(R.id.uuid)).getText().toString();
        String name = ((EditText)findViewById(R.id.name)).getText().toString();
        String prof =  ((EditText)findViewById(R.id.prof)).getText().toString();
        RadioButton stu = (RadioButton)findViewById(R.id.radioButton_stu);
        RadioButton tea = (RadioButton)findViewById(R.id.radioButton_tea);
        Log.i("sign_up",username+password+uuid+name+prof);
    }
    public void back(View view){

        finish();
    }
}
