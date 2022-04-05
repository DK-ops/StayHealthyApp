package com.mobilepro.stayhealthy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegistP extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist_p);
    }

    public void Regist (View view){
        Intent intent = new Intent(RegistP.this, LoginP.class);
        startActivity(intent);
    }
    public void LoginTo (View view){
        Intent intent1 = new Intent(RegistP.this, LoginP.class);
        startActivity(intent1);
    }
}