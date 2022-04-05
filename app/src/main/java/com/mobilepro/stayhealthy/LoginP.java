package com.mobilepro.stayhealthy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginP extends AppCompatActivity {
    public static final String EMAIL = "email";
    private static final String PASSWORD = "123456";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_p);
    }

    public void login (View view) {
        Intent intent = new Intent(LoginP.this, MainActivity.class);

        EditText edttUsern = findViewById(R.id.edtUsername);
        EditText edtPass = findViewById(R.id.edtforpass1);

        String email = edttUsern.getText().toString();
        String pass = edtPass.getText().toString();

        if (pass.equals(PASSWORD)) {
            intent.putExtra(EMAIL, email);
            startActivity(intent);
        }else {
            Toast.makeText(getApplicationContext(), "Password yang Anda Masukkan salah.", Toast.LENGTH_LONG).show();
        }
    }
    public void registo (View view) {
        Intent intent1 = new Intent(LoginP.this, RegistP.class);

        TextView tvreg = findViewById(R.id.tvDaftar);

        startActivity(intent1);
    }
    public void gotpass (View view){
        Intent intent2 = new Intent(LoginP.this, ForgotPass.class);
        startActivity(intent2);
    }
}