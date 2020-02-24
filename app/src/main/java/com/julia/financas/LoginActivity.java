package com.julia.financas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void abrirPrincipal(View view){
        Intent intent = new Intent(this, PrincipalActivity.class);
        startActivity(intent);
    }
}
